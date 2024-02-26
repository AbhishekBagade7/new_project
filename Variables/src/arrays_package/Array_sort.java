package arrays_package;

import java.util.Arrays;

public class Array_sort {

	public static void main(String[] args) {
		
		// create of array length 4  and copy its value an array in another iteration
		String name [] = new String [4];
		name [0] = "xzya";
		name [1] = "abcd";
		name [2] = "efgh";
		name [3] = "ijkl";
		String fname[] = new String[4];  // assigning to another string
		fname = name;                    //equals to assigning 
		for(int i=0; i<fname.length; i++) {
           Arrays.sort(fname);      // sorting
		System.out.println(fname[i]);   
		}
		
	}

}
