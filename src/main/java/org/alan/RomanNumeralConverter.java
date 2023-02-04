package org.alan;

import java.util.Map;
import java.util.TreeMap;

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
        var integerToNumeralMap = new TreeMap<>(Map.of
                (1, "I",
                4,"IV",
                5, "V",
                9, "IX",
                10, "X",
                50, "L",
                100, "C",
                500, "D",
                1000, "M"));
        StringBuilder result = new StringBuilder();
        while (input > 0) {
            Map.Entry<Integer, String> intNumeralPair = integerToNumeralMap.floorEntry(input);
            result.append(intNumeralPair.getValue());
            input -= intNumeralPair.getKey();
        }
        return result.toString();
    }
}
