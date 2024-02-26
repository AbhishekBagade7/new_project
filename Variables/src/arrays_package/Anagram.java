package arrays_package;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String angagram = "care";
		String anaga = "race";
		if(anaga.length()!=angagram.length())
		{
			System.out.println("I am not anagram");
		}
		else
		{
			char [] ch =angagram.toCharArray();
			 Arrays.sort(ch);
			System.out.println( Arrays.toString(ch));
			char [] ch2 =anaga.toCharArray();
			 Arrays.sort(ch2);
			System.out.println( Arrays.toString(ch2));
		
		if(Arrays.equals(ch, ch2)==true) {
			System.out.println("Anagram true");
		}
			
		}
	}

}
