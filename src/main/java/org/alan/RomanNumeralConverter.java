package org.alan;

import java.util.Map;

public class RomanNumeralConverter {

    /*
    initialize map of integer as keys, roman numerals as values
    while input > 0
        find the biggest number that is lower or equal to input from the keys in map
        get key value pair from map using key
        concatenate result string with numeral value
        subtract integer key from input
    return result

     */
    public String fromIntToNumeral(int input) {
        var integerToNumeralMap = Map.of(1, "I");
        return integerToNumeralMap.get(input);
    }
}
