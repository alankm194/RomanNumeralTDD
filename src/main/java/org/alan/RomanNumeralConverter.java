package org.alan;

import java.util.Collections;
import java.util.Map;
import java.util.NavigableMap;
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

    private final static NavigableMap<Integer, String> INTEGER_NUMERAL_MAP;
    static {
        var map = new TreeMap<Integer, String>();
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");
        INTEGER_NUMERAL_MAP = Collections.unmodifiableNavigableMap(map);
    }
    public String fromIntToNumeral(int input) throws IllegalArgumentException {
        if (input <= 0 || input >= 100000) { throw new IllegalArgumentException("input must be between 1 and 99999");}
        var result = new StringBuilder();
        while (input > 0) {
            Map.Entry<Integer, String> intNumeralPair = INTEGER_NUMERAL_MAP.floorEntry(input);
            result.append(intNumeralPair.getValue());
            input -= intNumeralPair.getKey();
        }
        return result.toString();
    }
}
