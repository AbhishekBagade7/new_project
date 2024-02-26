package string_methods;

import java.util.Scanner;

public class SubString_method {

	public static void main(String[] args) {
		String name = "MANISH";
		for(int i=0; i<=5; i++) {
			System.out.println(name.charAt(i));
		}
		System.out.println(name.substring(0, 5));
		try {
		int a =1/1;
		System.out.println("hello");
		}
		catch(ArithmeticException a1) {
			System.out.println("print");
		}
		finally {
			System.out.println("finally block");
		}
		int a =1/0;{
		System.out.println(a);
		}

	}

}
