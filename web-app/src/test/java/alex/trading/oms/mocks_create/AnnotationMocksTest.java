package alex.trading.oms.mocks_create;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Use Annotation to create a mock object.
 */
public class AnnotationMocksTest {

    @Mock
    Map<String, Object> mapMock;

    @BeforeEach
    void setUp() {
        //MockitoAnnotations.initMocks(this);
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testMock() {
        mapMock.put("keyvalue", "foo");

        when(mapMock.get("keyvalue")).thenReturn("foo");
        when(mapMock.size()).thenReturn(1);

        assertEquals("foo", mapMock.get("keyvalue"));
        assertEquals(1, mapMock.size());

        // verify that we call mapMock.put method once
        verify(mapMock).put(anyString(), anyString());

        mapMock.put("keyvalue2", "foo2");
        mapMock.put("keyvalue2", "foo3");

        // now verify that we call mapMock.put method 3 times
        verify(mapMock, times(3)).put(anyString(), anyString());
    }
}

