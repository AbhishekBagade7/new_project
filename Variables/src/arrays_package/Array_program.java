package arrays_package;

import java.util.Arrays;

public class Array_program {

	public static void main(String[] args) {
		 String name [] = new String[4];
		  int rollno [] = new int[4];
		  double salary [] = new double [4];
		  
		  name [0] = "Abhi";
		  rollno [0] = 7;
		  salary [0] = 2000.50;
		  name [1] = "lash";
		  rollno [1] = 8;
		  salary [1] = 5000.50;
		  name [2] = "water";
		  rollno [2] = 9;
		  salary [2] = 4000.50;
		  name [3] = "shek";
		  rollno [3] = 66;
		  salary [3] = 2590.78;
 for(int i =0; i<4; i++)
 {
	 //System.out.println(name[i] + " " + rollno[i] +" " + salary[i]);
	 Arrays.sort(name);
	 Arrays.sort(rollno);
	 System.out.println(Arrays.toString(name));
	 System.out.println(Arrays.toString(rollno));
	// System.out.println(salary[i]);
 }
	}

}
