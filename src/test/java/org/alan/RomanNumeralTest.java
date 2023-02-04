package org.alan;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralTest {
    
    private RomanNumeralConverter converter;
    @BeforeEach
    public void init() {
        converter = new RomanNumeralConverter();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/singleCharacterRomanNumeralTest.csv", numLinesToSkip = 1)
    public void WhenIntegerHasSingleRomanNumeralCharacter_ThenReturnCharacter(int input, String expected) {
        assertEquals(expected, converter.fromIntToNumeral(input));
    }
    @Test
    public void whenIntegerIs2_thenReturnII() {
        assertEquals("II", converter.fromIntToNumeral(2));
    }

    @Test
    public void whenIntegerIs3_thenReturnIII() {
        assertEquals("III", converter.fromIntToNumeral(3));
    }

    @Test
    public void whenIntegerIs4_thenReturnIV() {
        assertEquals("IV", converter.fromIntToNumeral(4));
    }

    @Test
    public void whenIntegerIs9_thenReturnIX() {
        assertEquals("IX", converter.fromIntToNumeral(9));
    }
    @Test
    public void whenIntegerIs40_thenReturnXL() {
        assertEquals("XL", converter.fromIntToNumeral(40));
    }

    @Test
    public void whenIntegerIs90_thenReturnXL() {
        assertEquals("XC", converter.fromIntToNumeral(90));
    }

    @Test
    public void whenIntegerIs400_thenReturnCD() {
        assertEquals("CD", converter.fromIntToNumeral(400));
    }

    @Test
    public void whenIntegerIs900_thenReturnCM() {
        assertEquals("CM", converter.fromIntToNumeral(900));
    }
}
