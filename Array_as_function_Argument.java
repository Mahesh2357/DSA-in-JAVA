package AP_Arrays;

public class Array_as_function_Argument {
	public static void update(int marks[], int non) {
		for(int i=0; i<marks.length; i++) {
			marks[i] = marks[i] + 1;
		}
	}
	
	public static void main(String[] args) {
		int marks[] = {12, 35, 3442};
		int nonchangable = 5;
		update(marks, nonchangable);
		System.out.println(nonchangable);
		
		for(int i =0; i<marks.length; i++) {
			System.out.println(marks[i] + " ");
		}
		System.out.println();
	}

}
