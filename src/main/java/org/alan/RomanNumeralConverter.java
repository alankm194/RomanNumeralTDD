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
        var integerToNumeralMap = new TreeMap<Integer, String>();
        integerToNumeralMap.put(1, "I");
        integerToNumeralMap.put(4, "IV");
        integerToNumeralMap.put(5, "V");
        integerToNumeralMap.put(9, "IX");
        integerToNumeralMap.put(10, "X");
        integerToNumeralMap.put(40, "XL");
        integerToNumeralMap.put(50, "L");
        integerToNumeralMap.put(90, "XC");
        integerToNumeralMap.put(100, "C");
        integerToNumeralMap.put(500, "D");
        integerToNumeralMap.put(1000, "M");

        StringBuilder result = new StringBuilder();
        while (input > 0) {
            Map.Entry<Integer, String> intNumeralPair = integerToNumeralMap.floorEntry(input);
            result.append(intNumeralPair.getValue());
            input -= intNumeralPair.getKey();
        }
        return result.toString();
    }
}
