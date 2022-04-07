package javaRoman;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {

    String[] thousands = {"", "M", "MM", "MMM"};
    String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "CM"};
    String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

    public String convertIntToRoman( int arabicNumerals) {
        return thousands[arabicNumerals / 1000] +
                hundreds[(arabicNumerals % 1000) / 100] +
                tens[(arabicNumerals % 100) / 10] +
                units[arabicNumerals % 10];
    }

}
