package String;

public class Largest_String {

    public static void main(String[] args) {
        String fruits[] = {"apple", "Orange", "DragonFruit"};

        String largest = fruits[0];

        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println("The largest (lexicographically) string is: " + largest);
    }
}
