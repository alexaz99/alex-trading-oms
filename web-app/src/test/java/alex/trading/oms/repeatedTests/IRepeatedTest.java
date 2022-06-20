package alex.trading.oms.repeatedTests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInstance;

/**
 * So in this case the @Tag is no longer defined in each Test Controller Class,
 * but in the one Group Controller interface.
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//@TestInstance(TestInstance.Lifecycle.PER_METHOD)
@Tag("repeatedTests")
public interface IRepeatedTest {

    // use default method for interfaces.
    // method name does not matter
    @BeforeAll
    default void beforeAll() {
        System.out.println("beforeAll -> Lets do something here...");
    }


}
