package org.alan;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/singleCharacterRomanNumeralTest.csv", numLinesToSkip = 1)
    public void WhenIntegerHasSingleRomanNumeralCharacter_ThenReturnCharacter(int input, String expected) {
        RomanNumeralConverter romanNumConverter = new RomanNumeralConverter();
        assertEquals(expected, romanNumConverter.fromIntToNumeral(input));
    }
    @Test
    public void whenIntegerIs2_thenReturnII() {
        RomanNumeralConverter romanNumConverter = new RomanNumeralConverter();
        assertEquals("II", romanNumConverter.fromIntToNumeral(2));
    }
}
