package globalVariable;

import java.util.Scanner;

public class Switch_scanner {
    
	public static void main(String[] args) {
		 Scanner s2= new Scanner(System.in);
	     int a = s2.nextInt();
		int b=s2.nextInt();
		int c = s2.nextInt();
		switch(3) {
		case 1: 
		int add = b+c;
		System.out.println("print b+c: "+add);
		
		case 2: 
		int sub = b-c;
		System.out.println("print b-c: " +sub);
		
		case 3: 
			int multi = b*c;
			System.out.println("print b*c: "+multi);
			break;
		}
	}

}
