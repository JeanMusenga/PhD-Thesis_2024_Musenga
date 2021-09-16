import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureTest {

    @Test
    public void testCelsiusToFahrenheitConverter() throws Exception {
        double resultTempEquality = ConvertTemperature.convert(-40, FromTempType.CELSIUS);
        double resultAbsoluteMin = ConvertTemperature.convert(-273.15, FromTempType.CELSIUS);
        double resultNormal = ConvertTemperature.convert(23.0, FromTempType.CELSIUS);
        assertEquals(-40.0, resultTempEquality, 2D);
        assertEquals(-459.67, resultAbsoluteMin, 2D);
        assertEquals(73.4, resultNormal, 2D);
    }

    @Test
    public void testFahrenheitToCelsiusConverter() throws Exception {
        double resultTempEquality = ConvertTemperature.convert(-40, FromTempType.FAHRENHEIT);
        double resultAbsoluteMin = ConvertTemperature.convert(-459.67, FromTempType.FAHRENHEIT);
        double resultNormal = ConvertTemperature.convert(104.4, FromTempType.FAHRENHEIT);
        assertEquals(-40.0, resultTempEquality, 2D);
        assertEquals(-273.15, resultAbsoluteMin, 2D);
        assertEquals(40.22, resultNormal, 2D);
    }

    @Test
    public void testCorrectExceptionFromFahrenheit() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            ConvertTemperature.convert(-500, FromTempType.FAHRENHEIT);
        });
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains("Temperature cannot be lower than absolute min"));
    }

    @Test
    public void testCorrectExceptionFromCelsius() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            ConvertTemperature.convert(-274, FromTempType.CELSIUS);
        });
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains("Temperature cannot be lower than absolute min"));
    }
}
