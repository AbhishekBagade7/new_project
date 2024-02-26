package arrays_package;
public class Pallindrome {
	public static void main(String[] args) 
	{
	String input="swati";
	String output="";
	
	for(int i=input.length()-1;i>=0;i--)
	{
		char reverse=			input.charAt(i);
		output=output+reverse;
	}
	System.out.println(output);

	if(input.equals(output))
	{
		System.out.println("The given String is a Pallindrome");
	}
	else
	{
		System.out.println("The given String is not a Pallindrome");
	
	}

	}
}
