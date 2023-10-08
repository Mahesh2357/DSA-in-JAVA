package String;

public class String2 {

    public static void main(String[] args) {
        //str1 and str2 point to the same "Tony" string
        String str1 = "Tony";
        String str2 = "Tony";

        //str3 points to a newly created "Tony" string
        String str3 = new String("Tony");

        // Concatenate the English alphabet to str1
        for (char ch = 'a'; ch <= 'z'; ch++) {
            str1 += ch;
        }

        // Print the modified str1
        System.out.println("Modified str1: " + str1);
    }
}
