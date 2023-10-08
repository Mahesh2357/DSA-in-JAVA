package String;

public class Substring {
	public static String subString(String str, int startIndex, int endIndex) {
		String substr = "";

		for (int i = startIndex; i <= endIndex; i++) {
			substr += str.charAt(i);
		}
		return substr;
	}

	public static void main(String[] args) {
		String str = "HelloWORLD";

		// Using your custom subString method
		System.out.println(subString(str, 0, 6)); // Output: "HelloWO"

		// Using the built-in substring method
		System.out.println(str.substring(0, 6)); // Output: "HelloW"
	}
}

// The output of subString is indeed "HelloWO"
// because it includes the character at the endIndex, 
// whereas the substring method excludes it. 