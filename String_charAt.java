package String;

public class String_charAt {
	public static void printLetter(String str) {

		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i) + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "1234567";
		String s1 = "MAHESH ";
		String s2 = "MUNGASE";
		
		printLetter(s);
		printLetter(s1);
		printLetter(s2);
	}

}
