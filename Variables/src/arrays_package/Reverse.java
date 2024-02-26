package arrays_package;

public class Reverse {

	public static void main(String[] args) {
		String reverse = "Abhishek";
		
		String sr = reverse;
		String output = "";
		for(int i=reverse.length()-1; i>=0; i--) {
			char cr = reverse.charAt(i);
			output=output+cr;
			//System.out.println(output);
		}
		System.out.println(output);
	}

}
