/**
 * Given an integer x, return true if x is a palindrome, and false otherwise.

 * An integer is a palindrome when it reads the same forward and backward. For example, 121 is a palindrome while 123 is not.

 * URL: https://leetcode.com/problems/palindrome-number
 */

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        int original = x;
        int reverse = 0;
        while (x > 0) {
            int lastDigit = x % 10;
            reverse = reverse * 10 + lastDigit;
            x /= 10;
        }
        return original == reverse;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121)); // true
        System.out.println(isPalindrome(126)); // false    
    }
}
