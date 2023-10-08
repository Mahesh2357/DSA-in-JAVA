package String;

import java.util.Arrays;

public class Lexicographical_Sort {
    public static void main(String[] args) {
        String fruits[] = {"apple", "Orange", "DragonFruit"};

        // Sort the array in lexicographical order
        Arrays.sort(fruits);

        // Print the sorted array
        System.out.println("Fruits sorted in lexicographical order:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
