package alex.trading.oms.parametizedTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MethodSourceTests {

    @DisplayName("Method Provider Test")
    @ParameterizedTest(name = "{displayName} - [{index}] {arguments}")
    @MethodSource("getArgs")
    void fromMethodTest(String stateName, int val1, int val2) {
        System.out.println(stateName + " = " + val1 + ":" + val2);
    }

    // Use this method as an example
    static Stream<Arguments> getArgs() {
        return Stream.of(
                Arguments.of("CA", 11, 11),
                Arguments.of("NJ", 21, 21),
                Arguments.of(null, Integer.MAX_VALUE, Integer.MIN_VALUE),
                Arguments.of("NY", 31, 31));
    }

}
