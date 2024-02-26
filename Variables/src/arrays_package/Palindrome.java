package arrays_package;

public class Palindrome {

	public static void main(String[] args) {
		String name = "Malayalam";
		String reverse = "";
		for(int i=name.length()-1; i>=0; i--) {
			char rev = name.charAt(i);
			reverse = reverse + rev;
		}
		System.out.println(reverse);
	}

}
