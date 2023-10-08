package AP_Arrays;

public class Linear_Search {
	public static int LinearSearch(int num[], int key) {
		for(int i = 0; i <num.length; i++) {
			if(num[i] == key) {
				return i;
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		int num[] = {1,2, 3, 4, 5, 6, 7, 8};
		int key = 8;
		
		int index = LinearSearch(num, key);  
		if(index == -1) {
			System.out.println("Not Found");
		}else {
			System.out.println("Key is at Index : " + index);
		}
	
	}
}
