package arrays_package;

import java.util.Scanner;

public class Int_datatype {

	public static void main(String[] args) {
		int datatype[] =new int[5];
		
		Scanner sc = new Scanner(System.in);
		datatype[0] = sc.nextInt();
		datatype[1] = sc.nextInt();
		datatype[2] = sc.nextInt();
		datatype[3] = sc.nextInt();
		datatype[4] = sc.nextInt();
		 for(int i=0; i<5; i++) {
			
				 System.out.println(datatype[i]);
			 
			 }
	}

}
