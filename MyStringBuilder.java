package String;

public class MyStringBuilder {

    public static void main(String[] args) {
        // Create a StringBuilder instance
        StringBuilder sb = new StringBuilder();

        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }

        // Convert the StringBuilder to a String and print it
        String result = sb.toString();
        System.out.println(result);
        
        //O(n^2)
        System.out.println(sb.length());
    }
}
