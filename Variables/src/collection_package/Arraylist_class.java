package collection_package;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Arraylist_class {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		/*a1.add("abhi");             // String
		a1.add('B');               // char
		a1.add(89);               // int
		a1.add(88.90);           // float
		a1.add(99.6789034);     // double
		a1.add("abhi");        // duplicate
		a1.add(null);         // null		
		System.out.println("ArrayList     :"+ a1);*/
		a1.add("collection");            // String
		a1.add("abstraction");           // String
		a1.add("interface");             // String
		a1.add("variables");             // String
		a1.add("java");                  // String
		a1.add("language");              // String	
		Collections.sort(a1);
		System.out.println("ArrayList     :"+ a1);
	}

}
