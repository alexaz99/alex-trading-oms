package alex.trading.oms.parametizedTests;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ValueSourceOwnerTest implements ModelTest {

    @ParameterizedTest
    @ValueSource(strings = {"Spring", "Framework", "Guru"})
    void testValueSource(String val) {
        System.out.println(val);
    }

}
