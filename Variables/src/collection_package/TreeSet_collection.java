package collection_package;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSet_collection {

	public static void main(String[] args) {
		TreeSet t1 =new TreeSet();
        t1.add("abhi");             // String
		//t1.add('B');               // char
		//t1.add(89);               // int
		//t1.add(88.90);           // float
		//t1.add(99.6789034);     // double
		t1.add("abhi");        // duplicate
		//t1.add(null);         // null
		 t1.add("collection");            // String
			t1.add("abstraction");           // String
			t1.add("interface");             // String
			t1.add("variables");             // String
			t1.add("java");                  // String
			t1.add("language");              // String	
			//Collections.sort(t1);
		System.out.println("TreeSet       :"+ t1);

	}

}
