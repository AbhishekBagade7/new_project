package collection_package;

import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHashSet_collection {

	public static void main(String[] args) {
		LinkedHashSet Lh1 =new LinkedHashSet();
	      Lh1.add("abhi");             // String
	      Lh1.add('B');               // char
	      Lh1.add(89);               // int
	      Lh1.add(88.90);           // float
	      Lh1.add(99.6789034);     // double
	      Lh1.add("abhi");        // duplicate
	      Lh1.add(null);         // null
	      System.out.println("LinkedHashSet :"+ Lh1);
	      
	}

}
