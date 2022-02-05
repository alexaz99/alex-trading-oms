package alex.trading.oms.observers.prices;

/**
 * 1. Create a Subject interface. Any changes in subject will be published to all
 *    registered Observers.
 * 2. Create a Observer interface.
 * 3. Implement Subject in StockGrabber
 * 4. Implement each Observer in StockObserver class
 * 5. Now assemble the application
 *
 * After we created a workable single threaded app, at the end we enhance
 * with multithreded app. No changes in the original classes are needed.
 * We only created a new GetTheStock class
 */
public class ObserverMarketDataApp {

    public static void main(String[] args) {

        // Create the Subject object
        // It will handle updating all observers
        // as well as deleting and adding them
        StockGrabber stockGrabber = new StockGrabber();

        // now create observers
        // After the pass the subject to each observer, each observer register itself to the Subject(stockGrabber)
        StockObserver observer1 = new StockObserver(stockGrabber);

        // now update the IBM price in StockGrabber and see that observer received it
        stockGrabber.seIBMPrice(197.00);
        stockGrabber.seAAPLPrice(689.00);
        stockGrabber.setGoogPrice(2015.00);

        //----------------------------------------------------------
        // second observer
        StockObserver observer2 = new StockObserver(stockGrabber);

        stockGrabber.seIBMPrice(187.00);
        stockGrabber.seAAPLPrice(677.00);
        stockGrabber.setGoogPrice(2013.00);

        // Delete one of the observers
        // now unregister Observer 1
        stockGrabber.unregister(observer1);

        stockGrabber.seIBMPrice(177.77);
        stockGrabber.seAAPLPrice(676.10);
        stockGrabber.setGoogPrice(2014.45);

        //--------------------------------------------
        //- Create 3 GetTheStock - random stock price generator
        Runnable getIBM = new GetTheStock(stockGrabber, 2000, "IBM", 127.00);
        Runnable getAAPL = new GetTheStock(stockGrabber, 1000, "AAPL", 150.00);
        Runnable getGOOG = new GetTheStock(stockGrabber, 3000, "GOOG", 2772.00);

        new Thread(getIBM).start();
        new Thread(getAAPL).start();
        new Thread(getGOOG).start();


    }
}

