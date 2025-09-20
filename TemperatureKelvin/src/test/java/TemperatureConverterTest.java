import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    TemperatureConverter tempConverter;

    @BeforeEach
    void setup() {
        tempConverter = new TemperatureConverter();

    }
    @Test
    void fahrenheitToCelsius() {
        assertEquals(-6.67, tempConverter.fahrenheitToCelsius(19.99));
    }

    @Test
    void celsiusToFahrenheit() {
        assertEquals(19.99, tempConverter.celsiusToFahrenheit(-6.67));
    }

    @Test
    void kelvinToCelsius() {
        assertEquals(26.85, tempConverter.kelvinToCelsius(300));
    }

    @Test
    void isExtremeTemperature() {
        assertTrue(tempConverter.isExtremeTemperature(-41));
        assertFalse(tempConverter.isExtremeTemperature(20));
        assertTrue(tempConverter.isExtremeTemperature(60));
    }
}