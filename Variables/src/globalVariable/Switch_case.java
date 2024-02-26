package globalVariable;

import java.util.Scanner;

public class Switch_case {
	
	
	public static void main(String[] args) {
		Scanner s2 = new Scanner(System.in);
		int a = s2.nextInt();
		int b=20;
			switch(3) {
		    case 1: 	
			int addition = a+b;
			System.out.println("case 1:- "+addition);
		    
		    case 2: 
			int sub = a-b;
			System.out.println("case 2:- "+sub);
		  
		    case 3: 
			int multi= a*b;
			System.out.println("case 3:- "+multi);
		    break;
		    case 4: 
			int div=a/b;
			System.out.println("case 4:- "+div);
		    
		    case 5: 
			int minus = a-b;
			System.out.println("case 5"+minus);	
		  
		    case 6: 
			int plus=a=b;
			System.out.println("case 6:- "+plus);
		   
		}
	}

}
