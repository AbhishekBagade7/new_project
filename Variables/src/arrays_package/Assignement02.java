package arrays_package;

public class Assignement02 {

	public static void main(String[] args) {
		String m1= "Software";
		String m2 = "Testing";
		String sr = m1.concat(m2);
		System.out.println(sr);
		for(int i=0; i<sr.length(); i++) {
			System.out.println(sr.charAt(i));
		}
	}

}