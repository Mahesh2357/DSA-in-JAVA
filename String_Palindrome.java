package String;

public class String_Palindrome {

    public static Boolean palindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false; // Return false as soon as a mismatch is found.
            }
        }
        return true; // If the loop completes without finding a mismatch, it's a palindrome.
    }

    public static void main(String[] args) {
        String s1 = "MAHESH";
        String s2 = "NOOOON";

        System.out.println(palindrome(s1)); // This will print "true" for "MAHESH"
        System.out.println(palindrome(s2)); // This will print "false" for "MUNGASE"
    }
}
