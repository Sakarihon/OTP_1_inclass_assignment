import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TemperatureConverterTest {

    @Test
    void fahrenheitToCelsius() {
        assertEquals(0.0, TemperatureConverter.fahrenheitToCelsius(32), 0.001);
        assertEquals(100.0, TemperatureConverter.fahrenheitToCelsius(212), 0.001);
        assertEquals(-40.0, TemperatureConverter.fahrenheitToCelsius(-40), 0.001);
    }

    @Test
    void celsiusToFahrenheit() {
        assertEquals(32.0, TemperatureConverter.celsiusToFahrenheit(0), 0.001);
        assertEquals(212.0, TemperatureConverter.celsiusToFahrenheit(100), 0.001);
        assertEquals(-40.0, TemperatureConverter.celsiusToFahrenheit(-40), 0.001);
    }

    @Test
    void isExtremeTemperature() {
        assertTrue(TemperatureConverter.isExtremeTemperature(-50));
        assertTrue(TemperatureConverter.isExtremeTemperature(60));
        assertFalse(TemperatureConverter.isExtremeTemperature(0));
        assertFalse(TemperatureConverter.isExtremeTemperature(25));
    }

    @Test
    void kelvinToCelsius() {
        assertEquals(26.85, TemperatureConverter.kelvinToCelsius(300), 0.001);
        assertEquals(0.0, TemperatureConverter.kelvinToCelsius(273.15), 0.001);
        assertEquals(-273.15, TemperatureConverter.kelvinToCelsius(0), 0.001);
    }
}