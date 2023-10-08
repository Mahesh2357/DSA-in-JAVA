package BIt_Manipulation;

public class ModularExponentiation {

    // Calculate (base^exponent) % modulus using the binary exponentiation method.
    public static long modPow(long base, long exponent, long modulus) {
        if (modulus == 1) {
            return 0; // Any number modulo 1 is 0.
        }

        long result = 1;
        base = base % modulus;

        while (exponent > 0) {
            // If the current exponent bit is 1, multiply result with base and take modulo.
            if ((exponent & 1) == 1) {
                result = (result * base) % modulus;
            }

            // Square the base and take modulo to reduce the problem size.
            base = (base * base) % modulus;
            exponent >>= 1; // Right shift to check the next bit.
        }

        return result;
    }

    public static void main(String[] args) {
        long base = 2;
        long exponent = 10;
        long modulus = 1000;

        long result = modPow(base, exponent, modulus);

        System.out.println(base + "^" + exponent + " % " + modulus + " = " + result);
    }
}
