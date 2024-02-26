package globalVariable;

import java.util.Scanner;

public class Scanner_methods {
	
	static void Div()
	{
		Scanner S1 = new Scanner(System.in);
		int a = S1.nextInt();
		int b = S1.nextInt();
		int div = a/b;
		System.out.println(div);
	}
	static void Mult()
	{
		Scanner S1 = new Scanner(System.in);
		int a = S1.nextInt();
		int b = S1.nextInt();
		int mult = a*b;
		System.out.println(mult);
	}
	static void Sub()
	{
		Scanner S1 = new Scanner(System.in);
		int a = S1.nextInt();
		int b = S1.nextInt();
		int sub = a-b;
		System.out.println(sub);
	}
	 void Add()
	{
		Scanner S1 = new Scanner(System.in);
		int a = S1.nextInt();
		int b = S1.nextInt();
		int add = a+b;
		System.out.println(add);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub();
		Scanner_methods Sm1 = new Scanner_methods();
		Sm1.Add();
		Div();
		Mult();
		
	}

}
