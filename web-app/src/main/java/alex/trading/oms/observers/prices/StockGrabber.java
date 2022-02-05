package alex.trading.oms.observers.prices;

import alex.trading.oms.observers.IObserver;
import alex.trading.oms.observers.ISubject;

import java.util.ArrayList;
import java.util.Objects;

/**
 * StockGrabber class uses the Subject interface to update all Observers.
 *
 *  For instance, you have a subject Order.
 *  Order has attributes like symbol, price, side and number of shares.
 *  For instance, we can modify(change) the price to fill or quantity.
 *  Each time we change these attributes, we want to notify observers.
 */
public class StockGrabber implements ISubject {

    private ArrayList<IObserver> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(IObserver newObserver) {
        Objects.requireNonNull(newObserver);
        observers.add(newObserver);
    }

    @Override
    public void unregister(IObserver deleteObserver) {
        Objects.requireNonNull(deleteObserver);
        int observerIndex = observers.indexOf(deleteObserver);
        //observers.remove(deleteObserver);

        if (observerIndex != -1) {
            System.out.println("Observer " + (observerIndex + 1) + " deleted");
            observers.remove(observerIndex);
        } else {
            System.out.println("Observer cannot be unregistered because never has been registered");
        }
    }

    @Override
    public void notifyObserver() {
/*        for (IObserver observer : observers) {
            observer.update(ibmPrice, aaplPrice, googPrice);
        }*/

        // don't need to check for null
        // Streams process all elements of a source, hence,
        // if there are no elements, no action will be taken.
        // Therefore, you don’t need to check whether the list is empty.
        observers.stream().forEach(o -> o.update(ibmPrice, aaplPrice, googPrice));
    }

    //-----------------------------------------------------------------------------
    //- create 3 methods to update prices
    //-----------------------------------------------------------------------------
    public void seIBMPrice(double newIBMPrice) {
        this.ibmPrice = newIBMPrice;
        notifyObserver();
    }

    public void seAAPLPrice(double newAAPLPrice) {
        this.aaplPrice = newAAPLPrice;
        notifyObserver();
    }

    public void setGoogPrice(double newGoogPrice) {
        this.googPrice = newGoogPrice;
        notifyObserver();
    }
}

