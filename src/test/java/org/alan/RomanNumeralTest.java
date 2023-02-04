package org.alan;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralTest {
    @Test
    public void WhenIntegerIs1_thenReturnI() {
        RomanNumeralConverter romanNumConverter = new RomanNumeralConverter();
        assertEquals("I", romanNumConverter.fromIntToNumeral(1));
    }

    @Test
    public void WhenIntegerIs5_thenReturnV() {
        RomanNumeralConverter romanNumConverter = new RomanNumeralConverter();
        assertEquals("V", romanNumConverter.fromIntToNumeral(5));
    }

    @Test
    public void WhenIntegerIs10_thenReturnX() {
        RomanNumeralConverter romanNumConverter = new RomanNumeralConverter();
        assertEquals("X", romanNumConverter.fromIntToNumeral(10));
    }

    @Test
    public void WhenIntegerIs50_thenReturnL() {
        RomanNumeralConverter romanNumConverter = new RomanNumeralConverter();
        assertEquals("L", romanNumConverter.fromIntToNumeral(50));
    }

    @Test
    public void WhenIntegerIs100_thenReturnC() {
        RomanNumeralConverter romanNumConverter = new RomanNumeralConverter();
        assertEquals("C", romanNumConverter.fromIntToNumeral(100));
    }

    @Test
    public void WhenIntegerIs500_thenReturnD() {
        RomanNumeralConverter romanNumConverter = new RomanNumeralConverter();
        assertEquals("D", romanNumConverter.fromIntToNumeral(500));
    }
}
