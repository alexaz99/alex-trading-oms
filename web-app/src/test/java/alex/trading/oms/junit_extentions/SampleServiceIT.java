package alex.trading.oms.junit_extentions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.Arrays;
import java.util.stream.Stream;

@ExtendWith(TimingExtension.class)
public class SampleServiceIT {

    @BeforeEach
    void setUp() {
    }

    @Test
    void findAll() {
        Stream stream = Stream.of(1,2,3,4,5,6,7);

        stream.forEach(i -> System.out.println(i));
    }

    @Test
    void findById() {
    }

    @Test
    void save() {
    }

    @Test
    void delete() {
    }

    @Test
    void deleteById() {
    }

}
