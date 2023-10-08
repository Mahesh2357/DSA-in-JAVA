package BIt_Manipulation;

public class TwosComplement {
    public static void main(String[] args) {
        int number = 89; // Replace this with the integer you want to find the two's complement of

        // Calculate the one's complement
        int onesComplement = ~number;

        // Calculate the two's complement by adding 1 to the one's complement
        int twosComplement = onesComplement + 1;

        System.out.println("Original Number: " + number);
        System.out.println("One's Complement: " + onesComplement);
        System.out.println("Two's Complement: " + twosComplement);
    }
}
