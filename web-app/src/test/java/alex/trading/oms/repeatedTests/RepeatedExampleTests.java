package alex.trading.oms.repeatedTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Run with JUnit5 extention for Mockito
 */
@ExtendWith(MockitoExtension.class)
public class RepeatedExampleTests implements IRepeatedTest {

    @DisplayName("Run Repeated Test 3 times")
    @RepeatedTest(value = 3)
    void runTestThreeTimes() {
        System.out.println("Running ...");
    }

    @RepeatedTest(5)
    void runRepeatedTestWithDI(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println(testInfo.getDisplayName() + ": " + repetitionInfo.getCurrentRepetition());

    }
}
