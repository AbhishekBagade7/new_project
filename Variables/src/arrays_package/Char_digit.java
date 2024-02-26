package arrays_package;
//"81.Find out number of char and number of digits in below string Rahul123"
public class Char_digit {
	public static void main(String[] args) 
	{
		String chardigit = "Abhishek12345";
		int charno =0;
		int digitno=0;
		for(int i=0; i<=chardigit.length()-1; i++) 		{
			char cr = chardigit.charAt(i);
			//System.out.println(cr);
			boolean br = Character.isDigit(cr);
			//System.out.println(br);
			if(br==true) {
				digitno++;
		    } 
			else {
				charno++;
			}
		}
		System.out.println("total num of char: "+charno);
		System.out.println("total num of digits: "+digitno);
	}
}
