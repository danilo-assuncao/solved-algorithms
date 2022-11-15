class Atoi {

    public static void main(String[] args) {
        myAtoi("   4540   ");
    }

    public static int myAtoi(String s) {
        var number = 0;
        var signal = '+';
        var numberCharLength = s.length() - 1;
        for (int i = numberCharLength; i >= 0; i--) {
            final var digit = s.charAt(i);
            if (digit >= 48 && digit <= 57) {
                number += (digit - '0') * Math.pow(10, numberCharLength - i);
            } else if (digit == 32) {
                continue;
            } else if (digit == 43 || digit == 45) {
                signal = digit;
            }
        }
        number *= (signal == '+' ? 1 : -1);
        System.out.println(number);
        return number;
    }
}
