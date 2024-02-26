package arrays_package;

public class Day_30 {

	public static void main(String[] args) {
		// replace of any letters in given String
		
		String fname = "abhisheka";
	String	repl = fname.replace("a", "b");
		System.out.println(repl);
		
		String quote = "I 356 Love 34 My Country 123";
		String place  =quote.replaceAll("[\\d]", "");
		String cap  =quote.replaceAll("[\\d,a-z]", "");
		String small  =quote.replaceAll("[\\d, A-Z]", "");
  System.out.println(place);
  System.out.println(cap);
  System.out.println(small);
  
  String myname = "AbHiShEk";
  String removelower= myname.replaceAll("[a-z]", " ");
  String removecap = myname.replaceAll("[ A-Z]", " ");
  System.out.println(removelower);
  System.out.println(removecap);
	}

}
