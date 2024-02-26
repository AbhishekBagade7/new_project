package string_methods;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Guess_output {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		try {
			System.out.println("Enter the number");
			int a1 = s1.nextInt();
		System.out.println("Li");
		}
		catch(InputMismatchException i1){
			System.out.println("hi");
			
		}

	}

}
