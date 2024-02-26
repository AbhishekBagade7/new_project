package arrays_package;

public class Alphanumiric {

	public static void main(String[] args) {
		String name = "Abhi55shek123";		
		for (int i=0; i<name.length(); i++)
		{
			char ch [] = name.toCharArray();		
			boolean tr = Character.isDigit(ch[i]);			
			if(tr==true) {
			System.out.println("if it is digit print "  +tr);			
			}
			else {
				System.out.println("if it is char print " +ch[i] );
			}
		}
	}

}
