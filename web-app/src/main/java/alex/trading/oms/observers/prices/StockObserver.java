package alex.trading.oms.observers.prices;

import alex.trading.oms.observers.IObserver;
import alex.trading.oms.observers.ISubject;

/**
 * This class represents each Observer that is monitoring changes in the subject
 */
public class StockObserver implements IObserver {

    /** In this example each observer is going to monitor 3 stocks */
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    /** We will share this counter amoung all Observers to assign unique ID to each Observer */
    private static int observerIDTracker = 0;

    /** A unique identifier for each observer */
    private int observerID;

    /** This is the reference to the Subject (Stock Grabber) */
    private ISubject stockGrabber;

    /**
     * Pass(constructor wire) observable object with each observer.
     * The idea is that we register each this observer with the
     * observable object as callback.
     */
    public StockObserver(ISubject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTracker;
        System.out.println("New Observer " + this.observerID + " has been created.");

        // ! Important wiring back with the object from
        // which we want to reveive some updates.
        stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;
        printThePrices();
    }

    public void printThePrices() {
        System.out.println(observerID + "\nIBM: " + ibmPrice +
                "\nAAPL: " + aaplPrice + "\nGOOG: " + googPrice + "\n");
    }
}
