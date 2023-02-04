package org.alan;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralTest {
    @Test
    public void WhenIntegerIs1_thenReturnI() {
        RomanNumeralConverter romanNumConverter = new RomanNumeralConverter();
        assertEquals("I", romanNumConverter.fromIntToNumeral(1));
    }
}
