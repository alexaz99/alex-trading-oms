package alex.trading.oms.parametizedTests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
@Tag("value-tests")
public interface IValueTests {

    @BeforeAll
    default void beforeAll() {
        System.out.println("beforeAll -> Lets do something here...");
    }
}
