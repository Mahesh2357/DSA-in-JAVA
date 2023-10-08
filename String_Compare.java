package String;

public class String_Compare {
    public static void compareString() {
        // Comparing strings for content equality
        String str1 = "Hello";
        String str2 = "Hello";
        boolean isEqual1 = str1.equals(str2); // true

        // Comparing strings for content equality, ignoring case
        String str3 = "Hello";
        String str4 = "hello";
        boolean isEqual2 = str3.equalsIgnoreCase(str4); // true

        // Comparing strings lexicographically
        String str5 = "apple";
        String str6 = "banana";
        int result1 = str5.compareTo(str6); // -1

        // Comparing strings lexicographically, ignoring case
        String str7 = "Apple";
        String str8 = "banana";
        int result2 = str7.compareToIgnoreCase(str8); // -1

        // Comparing string objects by reference
        String str9 = new String("Hello");
        String str10 = new String("Hello");
        boolean isEqual3 = (str9 == str10); // false

        // Comparing string objects by content and reference
        String str11 = "Hello";
        String str12 = new String("Hello");
        boolean isEqual4 = str11.equals(str12) && (str11 == str12); // true

        // Checking if a string starts with a specified substring
        String str13 = "Hello, World!";
        boolean startsWithHello = str13.startsWith("Hello"); // true

        // Checking if a string ends with a specified substring
        boolean endsWithWorld = str13.endsWith("World"); // false

        // Using regular expressions to check if a string contains a pattern
        String str14 = "OpenAI is amazing!";
        boolean containsAI = str14.matches(".*AI.*"); // true
    }

    public static void main(String[] args) {
        // String object comparisons
        String s1 = "MAHESH";
        String s2 = "MAHESH";
        String s3 = new String("MAHESH");

        if (s1 == s2) {
            System.out.println("s1 and s2 are the same object in memory.");
        } else {
            System.out.println("s1 and s2 are not the same object in memory.");
        }

        if (s1 == s3) {
            System.out.println("s1 and s3 are the same object in memory.");
        } else {
            System.out.println("s1 and s3 are not the same object in memory.");
        }
    }
}
