import static java.util.Map.entry;

import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
    }

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
}
