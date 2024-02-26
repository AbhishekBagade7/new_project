package arrays_package;

public class Day_29 {

	public static void main(String[] args) {
		
		String name = "World";     // W =0, o=1, r=2, l=3, d=4
		 System.out.println( name.charAt(2));
		 System.out.println( name.indexOf("d"));
		 String  firstn= "Grotechminds";
		 System.out.println(firstn.substring(4));  // it removes first 4 letters
		 System.out.println( firstn.substring(2, 6));   // it removes first 2 letters and  it removes after 6th index
		 
		 String lastname = "my name is Abhishek";
		 System.out.println(lastname.contains(" A"));
		 System.out.println( lastname.matches("my name is abhishek"));
		 String empty = "";	
		 System.out.println(empty.isEmpty());
		 String mname = "my name is Abhishek";
		 System.out.println( mname.endsWith("k"));
	}

}
