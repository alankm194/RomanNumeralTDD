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

    private final static TreeMap<Integer, String> INTEGER_NUMERAL_MAP = new TreeMap<>();
    static {
        INTEGER_NUMERAL_MAP.put(1, "I");
        INTEGER_NUMERAL_MAP.put(4, "IV");
        INTEGER_NUMERAL_MAP.put(5, "V");
        INTEGER_NUMERAL_MAP.put(9, "IX");
        INTEGER_NUMERAL_MAP.put(10, "X");
        INTEGER_NUMERAL_MAP.put(40, "XL");
        INTEGER_NUMERAL_MAP.put(50, "L");
        INTEGER_NUMERAL_MAP.put(90, "XC");
        INTEGER_NUMERAL_MAP.put(100, "C");
        INTEGER_NUMERAL_MAP.put(400, "CD");
        INTEGER_NUMERAL_MAP.put(500, "D");
        INTEGER_NUMERAL_MAP.put(900, "CM");
        INTEGER_NUMERAL_MAP.put(1000, "M");
    }
    public String fromIntToNumeral(int input) {
        if (input == 0) {
            throw new IllegalArgumentException("input must be bigger than 0");
        }
        StringBuilder result = new StringBuilder();
        while (input > 0) {
            Map.Entry<Integer, String> intNumeralPair = INTEGER_NUMERAL_MAP.floorEntry(input);
            result.append(intNumeralPair.getValue());
            input -= intNumeralPair.getKey();
        }
        return result.toString();
    }
}
