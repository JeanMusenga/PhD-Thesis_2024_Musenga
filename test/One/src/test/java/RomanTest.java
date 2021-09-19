import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RomanTest {

    @Test
    public void testArabicToRoman() throws Exception {
        ConvertRomanNumber converter = new ConvertRomanNumber();
        String resultLowest = converter.arabicToRoman(1);
        String resultNormal = converter.arabicToRoman(2021);
        String resultHighest = converter.arabicToRoman(3999);
        assertEquals("I", resultLowest);
        assertEquals("MMXXI", resultNormal);
        assertEquals("MMMCMXCIX", resultHighest);
    }

    @Test
    public void testCorrectExceptionArabicToRomanZero() {
        ConvertRomanNumber converter = new ConvertRomanNumber();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            converter.arabicToRoman(0);
        });
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains("Arabic number cannot be lower than 1 or greater than 3999"));
    }

    @Test
    public void testCorrectExceptionArabicToRomanHigh() {
        ConvertRomanNumber converter = new ConvertRomanNumber();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            converter.arabicToRoman(5000);
        });
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains("Arabic number cannot be lower than 1 or greater than 3999"));
    }

    @Test
    public void testCorrectExceptionArabicToRomanNegative() {
        ConvertRomanNumber converter = new ConvertRomanNumber();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            converter.arabicToRoman(-3);
        });
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains("Arabic number cannot be lower than 1 or greater than 3999"));
    }
}
