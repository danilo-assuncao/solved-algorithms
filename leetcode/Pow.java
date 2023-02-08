/**
 * Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

 * Example 1:

 * Input: x = 2.00000, n = 10
 * Output: 1024.00000
 * Example 2:

 * Input: x = 2.10000, n = 3
 * Output: 9.26100
 * Example 3:

 * Input: x = 2.00000, n = -2
 * Output: 0.25000
 * Explanation: 2-2 = 1/22 = 1/4 = 0.25

 * Constraints:
 * 
 * -100.0 < x < 100.0
 * -2^31 <= n <= 2^31-1
 * n is an integer.
 * -10^4 <= x^n <= 10^4

 * ----------------------------------------------------------------------------
 * For this solution I use a technique called: Fast Exponentiation
 * 
 * This algorithm has a complexity: O(log n)
 * ----------------------------------------------------------------------------
*/
public class Pow {

    public static double pow(double base, int exp) {
        if (exp == Integer.MIN_VALUE && base > 1) {
            return 0;
        }
        double result = 1;
        int exponent = (exp > 0) ? exp : -exp;
        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result = result * base;
            }
            base = base * base;
            exponent >>= 1;
        }
        return (exp < 0) ? (1 / result) : result;
    }

    public static void main(String[] args) {
        System.out.println(pow(1.00000, -2147483648));  // 1.0
        System.out.println(pow(2.00000, -2147483648));  // 0.0
        System.out.println(pow(2.00000, 2));            // 4.0
    }
}