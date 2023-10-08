package BIt_Manipulation;

public class Power_of_two {

    public static boolean isPowerOf2(int num) {
        if (num <= 0) {
            return false;
        }

        return (num & (num - 1)) == 0;
    }

    public static void main(String[] args) {
        int number1 = 16; // 2^4
        int number2 = 18; // Not a power of 2

        System.out.println(number1 + " is a power of 2: " + isPowerOf2(number1)); // true
        System.out.println(number2 + " is a power of 2: " + isPowerOf2(number2)); // false
    }
}
