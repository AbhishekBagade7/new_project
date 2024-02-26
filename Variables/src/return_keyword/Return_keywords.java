package return_keyword;

import java.util.Scanner;

public class Return_keywords {
	float add(float a, float b) 
	{
		float sum = a+b;
		return  sum;	
	}
	double sub(int a, double b) 
	{
		 double sub =a-b;
		 return sub;
    }
	String add(String a) 
	 {
		 String sum = a;
			return  sum;	
	 }
	 boolean sub(boolean b) 
	 {
			boolean sub =b;
			 return sub;
	 }

	public static void main(String[] args) {
		Return_keywords rk = new Return_keywords();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String value");
		System.out.println(rk.add(sc.next()));
		System.out.println("Enter float value");
		System.out.println(rk.add(sc.nextFloat(), sc.nextFloat()));
		System.out.println("Enter boolean value");
		System.out.println(rk.sub(sc.nextBoolean()));
		System.out.println("Enter int and double value");
		System.out.println(rk.sub(sc.nextInt(), sc.nextDouble()));
		

	}

}
