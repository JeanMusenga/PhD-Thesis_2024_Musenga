import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureTest {

    @Test
    public void testCelsiusToFahrenheitConverter() throws Exception {
        ConvertTemperature converter = new ConvertTemperature();
        double resultTempEquality = converter.convert(-40, FromTempType.CELSIUS);
        double resultAbsoluteMin = converter.convert(-273.15, FromTempType.CELSIUS);
        double resultNormal = converter.convert(23.0, FromTempType.CELSIUS);
        assertEquals(-40.0, resultTempEquality, 2D);
        assertEquals(-459.67, resultAbsoluteMin, 2D);
        assertEquals(73.4, resultNormal, 2D);
    }

    @Test
    public void testFahrenheitToCelsiusConverter() throws Exception {
        ConvertTemperature converter = new ConvertTemperature();
        double resultTempEquality = converter.convert(-40, FromTempType.FAHRENHEIT);
        double resultAbsoluteMin = converter.convert(-459.67, FromTempType.FAHRENHEIT);
        double resultNormal = converter.convert(104.4, FromTempType.FAHRENHEIT);
        assertEquals(-40.0, resultTempEquality, 2D);
        assertEquals(-273.15, resultAbsoluteMin, 2D);
        assertEquals(40.22, resultNormal, 2D);
    }

    @Test
    public void testCorrectExceptionFromFahrenheit() {
        ConvertTemperature converter = new ConvertTemperature();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            converter.convert(-500, FromTempType.FAHRENHEIT);
        });
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains("Temperature cannot be lower than absolute min"));
    }

    @Test
    public void testCorrectExceptionFromCelsius() {
        ConvertTemperature converter = new ConvertTemperature();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            converter.convert(-274, FromTempType.CELSIUS);
        });
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains("Temperature cannot be lower than absolute min"));
    }
}
