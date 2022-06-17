package alex.trading.oms.parametizedTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

public class CustomArgsProviderTests implements ArgumentsProvider {

    @DisplayName("Custom Provider Test")
    @ParameterizedTest(name = "{displayName} - [{index}] {arguments}")
    @ArgumentsSource(CustomArgsProviderTests.class)
    void fromCustomProvigerTest(String stateName, int val1, int val2) {
        System.out.println(stateName + " = " + val1 + ":" + val2);
    }


    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
        return Stream.of(
                Arguments.of("CA", 77, 77),
                Arguments.of("NJ", 88, 88),
                Arguments.of(null, 76858, -4663),
                Arguments.of("NY", 99, 99));

    }
}
