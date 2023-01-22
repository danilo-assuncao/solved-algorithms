class Atoi {

    public static void main(String[] args) {
        myAtoi("-0032");
    }

    public static int myAtoi(String s) {
        var number = 0;
        var exponent = 0;
        var signal = '+';
        for (int i = s.length() - 1; i >= 0; i--) {
            final var digit = s.charAt(i);
            if (digit >= 48 && digit <= 57) {
                number += (digit - 48) * Math.pow(10, exponent);
                exponent++;
            } else if (digit == 43 || digit == 45) {
                signal = digit;
            }
        }
        number *= (signal == '+' ? 1 : -1);
        System.out.println(number);
        return number;
    }
}
