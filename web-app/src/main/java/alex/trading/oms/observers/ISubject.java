package alex.trading.oms.observers;

/**
 * A subject is an Observable subject that should notify all
 * registered Observers (listeners)
 * Should have 3 methods below.
 * This interface handles adding, deleting and updating all observers.
 *
 * For instance, you have a subject Order.
 * Order has attributes like symbol, price, side and number of shares.
 * For instance, we can modify(change) the price to fill or quantity.
 * Each time we change these attributes, we want to notify observers.
 *
 */
public interface ISubject {
    public void register(IObserver o);
    public void unregister(IObserver o);
    public void notifyObserver();
}
