package alex.trading.oms.observers.prices;

import alex.trading.oms.observers.ISubject;

import java.text.DecimalFormat;

/**
 * Individual Stock Price Generator
 * This class allows using Threads to generate prices for each individual stock.
 * This class is the frontrunner to receive each Stock Price(acts as a stock price generator)
 * and call next in line stockGrabber
 */
public class GetTheStock implements Runnable {

    /** Thread is updated based on the start time we defined */
    private int startTime; // identify how long we should wait till thread is executed
    private String stock;
    private double price;

    /** Need reference to StockGrabber to call its methods */
    private ISubject stockGrabber;

    /*public GetTheStock() {}*/

    public GetTheStock(ISubject stockGrabber, int newStartTime, String newStock, double newPrice) {
        this.stockGrabber = stockGrabber;
        this.startTime = newStartTime;
        this.stock = newStock;
        this.price = newPrice;
    }

    @Override
    public void run() {

        DecimalFormat df = new DecimalFormat("#.##");

        for (int i = 1; i <= 20; i++) {

/*            try {
                Thread.sleep(startTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/

            // now create a random number between a negative 3 cents and positive 3 cents
            double randNum = (Math.random() * .06) - .03;
            System.out.println("Stock: " + stock + ", randNum: " + randNum + ", RoundRandNum: " + df.format(randNum));

            // df.format(price + randNum) add original price with ranNum, convert to 2 decimal string
            // and convert back to double
            price = Double.valueOf(df.format(price + randNum));

            // this code below is for demonstration purpose only
            if (stock.equalsIgnoreCase("IBM")) {
                ((StockGrabber)stockGrabber).seIBMPrice(price);
            }

            if (stock.equalsIgnoreCase("AAPL")) {
                ((StockGrabber)stockGrabber).seIBMPrice(price);
            }

            if (stock.equalsIgnoreCase("GOOG")) {
                ((StockGrabber)stockGrabber).seIBMPrice(price);
            }

            System.out.println(stock + ": " + (df.format(price)) +
                    " " + df.format(randNum));
            System.out.println();
        }

    }

    public static void main(String[] args) {
        /*new GetTheStock().run();*/
    }

}

