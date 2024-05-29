package unittestsueben;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class DigitsTest {
    static Digits digits;
@BeforeAll
    public static void setup(){
        digits = new Digits();
    }
    @Test
    public void sharedCommonSecondAndFirstDigits(){
        boolean result = digits.shareDigit(41, 13);
        assertTrue(result);
    }

    @Test
    public void noSharedDigits(){
        boolean result = digits.shareDigit(41, 23);
        assertFalse(result);

    }

    @Test
    public void secondDigitOutOfRangeExceptions(){
        assertThrows(IllegalArgumentException.class, () -> {
            digits.shareDigit(10, 100);
        });
    }

    @Test
    public void firstDigitOutOfRangeExceptions(){
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            digits.shareDigit(100, 10);
        });
        assertEquals("the numers are not in the range 10 - 99.", e.getMessage());
    }

}