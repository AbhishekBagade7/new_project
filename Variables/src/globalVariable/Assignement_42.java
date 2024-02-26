package globalVariable;

import java.util.Scanner;

public class Assignement_42 {
	static Scanner addition = new Scanner(System.in);
	static int b = addition.nextInt();
	static int c = addition.nextInt();
	static int a = addition.nextInt();
	public static void main(String[] args) {
		switch(2) {
		case 1: System.out.println(b+c);
		case 2: System.out.println(b-c);
		case 3: System.out.println(b*c);
		case 4: System.out.println(b/c);
		default: System.out.println();
		}

	}

}
