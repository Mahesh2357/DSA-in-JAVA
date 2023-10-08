package BIt_Manipulation;

public class Ones_Compliment {
    public static void main(String[] args) {
        int number = 42; // Replace this with the integer you want to find the one's complement of

        int onesComplement = ~number;

        System.out.println("Original Number: " + number);
        System.out.println("One's Complement: " + onesComplement);
        
        
        System.out.println(~5);
        System.out.println(~0);
        System.out.println(~1);
        System.out.println(~-1);
    }
}

