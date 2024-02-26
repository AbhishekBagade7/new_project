package arrays_package;

public class Reverse_string {

	public static void main(String[] args) {
		String reverse = "My Name Is Abhishek";
		
		for(int i=reverse.length()-1; i>=0; i--) {
			System.out.print(reverse.charAt(i));
		}

	}

}
