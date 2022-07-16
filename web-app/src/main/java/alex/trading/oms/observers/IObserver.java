package alex.trading.oms.observers;

/**
 * Any implementation class of this interface will be registered
 * with the Subject.
 * When Subject content is changed, eacg registered Object will be notifird.
 *
 * @param <T>
 */
public interface IObserver<T> {

    public void update(double ibmPrice, double aaplPrice, double googPrice);

    public default void update(T t) {
        System.out.println("Not implemented");
    }
}
