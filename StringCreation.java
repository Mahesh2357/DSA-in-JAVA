package String;

import java.util.Scanner;

public class StringCreation {
	
	//String are immutable

    public static void main(String[] args) {
        char arr[] = { 'a', 'b', 'c', 'd' };
        String str = "abcd"; // Removed the semicolon here
        String str2 = new String("xyz");
        
        System.out.println(arr);

        Scanner sc = new Scanner(System.in);
        
        String name;
        System.out.print("Enter a single word: ");
        name = sc.next(); // Single word input
        System.out.println("You entered: " + name);

        System.out.println("***************");

        System.out.print("Enter a full line: ");
        sc.nextLine(); // Consume the previous newline character
        name = sc.nextLine(); // Full line input
        System.out.println("You entered: " + name);
        
        sc.close(); // Close the scanner when done
    }
}
