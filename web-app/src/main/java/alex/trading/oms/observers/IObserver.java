package alex.trading.oms.observers;

public interface IObserver<T> {

    public void update(double ibmPrice, double aaplPrice, double googPrice);

    public default void update(T t) {
        System.out.println("Not implemented");
    }
}
