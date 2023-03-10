package org.alan;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RomanNumeralTest {

    private RomanNumeralConverter converter;
    private final String illegalArgumentExceptionMessage = "input must be between 1 and 99999";

    @BeforeEach
    public void init() {
        converter = new RomanNumeralConverter();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/singleCharacterRomanNumeralTest.csv", numLinesToSkip = 1)
    public void WhenIntegerHasSingleRomanNumeralCharacter_ThenReturnCharacter(int input, String expected) {
        assertEquals(expected, converter.fromIntToNumeral(input));
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/validIntegerToRomanNumeralTest.csv", numLinesToSkip = 1)
    public void WhenIntegerIsValidNumber_ThenReturnCorrectRomaNumeral(int input, String expected) {
        assertEquals(expected, converter.fromIntToNumeral(input));
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/doubleRomanNumeralCharacterTest.csv", numLinesToSkip = 1)
    public void whenIntegerConvertsTo2RomanNumeralCharacters_Return2Numerals(int input, String expected) {
        assertEquals(expected, converter.fromIntToNumeral(input));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/lessThan1ThrowsExceptionTest.csv", numLinesToSkip = 1)
    public void whenIntegersAreLessThan1_throwIllegalArgumentException(int input) {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class,
                () -> converter.fromIntToNumeral(input),
                "IllegalArgumentException exception expected");

        assertEquals(illegalArgumentExceptionMessage, thrown.getMessage());
    }

    @Test
    public void whenIntegersIsIntegerMINVALUE_throwIllegalArgumentException() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class,
                () -> converter.fromIntToNumeral(Integer.MIN_VALUE),
                "IllegalArgumentException exception expected");

        assertEquals(illegalArgumentExceptionMessage, thrown.getMessage());
    }

    @Test
    public void whenIntegersIsAboveMaximumInput_throwIllegalArgumentException() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class,
                () -> converter.fromIntToNumeral(100000),
                "IllegalArgumentException exception expected");

        assertEquals(illegalArgumentExceptionMessage, thrown.getMessage());
    }

    @Test
    public void whenIntegersIsMaximumAllowedInput_returnExpectedResult() {
        String expected = "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMCMXCIX";
        assertEquals(expected, converter.fromIntToNumeral(99999));
    }

}
