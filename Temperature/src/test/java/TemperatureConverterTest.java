import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    TemperatureConverter tempConverter = new TemperatureConverter();

    @Test
    void fahrenheitToCelsius() {
        assertEquals(-6.666666666666667, tempConverter.fahrenheitToCelsius(20));
    }

    @Test
    void celsiusToFahrenheit() {
        assertEquals(20, tempConverter.celsiusToFahrenheit(-6.666666666666667));
    }

    @Test
    void isExtremeTemperature() {
        assertTrue(tempConverter.isExtremeTemperature(-41));
        assertFalse(tempConverter.isExtremeTemperature(20));
        assertTrue(tempConverter.isExtremeTemperature(60));
    }
}