package collection_package;

import java.util.Collections;
import java.util.Vector;

public class Vector_collection {

	public static void main(String[] args) {
		Vector v1 = new Vector();
		/*v1.add("abhi");             // String
		v1.add('B');               // char
		v1.add(89);               // int
		v1.add(88.90);           // float
		v1.add(99.6789034);     // double
		v1.add("abhi");        // duplicate
		v1.add(null);         // null*/
		v1.add("collection");            // String
		v1.add("abstraction");           // String
		v1.add("interface");             // String
		v1.add("variables");             // String
		v1.add("java");                  // String
		v1.add("language");              // String	
		Collections.sort(v1);
        System.out.println("Vector        :"+ v1);

	}

}
