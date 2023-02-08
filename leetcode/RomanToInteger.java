/** 
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000

 * For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

 * I can be placed before V (5) and X (10) to make 4 and 9. 
 * X can be placed before L (50) and C (100) to make 40 and 90. 
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer.
 
 * URL: https://leetcode.com/problems/roman-to-integer 
*/

import static java.util.Map.entry;

import java.util.Map;

public class RomanToInteger {

    private static final Map<Character, Integer> ROMAN_VALUES = 
    Map.ofEntries(
        entry('I', 1),
        entry('V', 5),
        entry('X', 10),
        entry('L', 50),
        entry('C', 100),
        entry('D', 500),
        entry('M', 1000)
    );

    public static int romanToInt(String s) {
        var sum = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if ((i - 1) < 0) {
                sum += ROMAN_VALUES.get(s.charAt(0));
            } else {
                var v1 = ROMAN_VALUES.get(s.charAt(i));
                var v2 = ROMAN_VALUES.get(s.charAt(i - 1));
                if (v2 < v1) {
                    sum += v1 - v2;
                    i--;
                } else {
                    sum += v1;
                }
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("IV")); // 4
        System.out.println(romanToInt("VI")); // 6
    }
}
