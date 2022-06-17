package alex.trading.oms.repeatedTests;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
@Tag("repeated")
public interface IModelRepeatedTest {

    /**
     * Uses interface to output test information (name and iteration
     */
    @BeforeEach
    default void beforeEachOutputer(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println("Running Test - " + testInfo.getDisplayName() + " - " +
                repetitionInfo.getCurrentRepetition() + " | " + repetitionInfo.getTotalRepetitions());
    }

}
