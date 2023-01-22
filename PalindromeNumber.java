

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121)); // true
        System.out.println(isPalindrome(126)); // false    
    }

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
}
