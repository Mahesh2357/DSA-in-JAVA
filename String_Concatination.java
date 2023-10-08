package String;

public class String_Concatination {
	
	public static String concatinationString(String str1, String str2) {
		String res = str1 + str2; 
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "MAHESH ";
		String s2 = "MUNGASE";
		
		String concat1 = concatinationString(s1, s2);
		System.out.println(concat1);
	}

}
