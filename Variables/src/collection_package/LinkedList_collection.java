package collection_package;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_collection {

	public static void main(String[] args) {
		LinkedList l1 =new LinkedList();
       /* l1.add("abhi");             // String
		l1.add('B');               // char
		l1.add(89);               // int
		l1.add(88.90);           // float
		l1.add(99.6789034);     // double
		l1.add("abhi");        // duplicate
		l1.add(null);         // null*/
		l1.add("collection");            // String
		l1.add("abstraction");           // String
		l1.add("interface");             // String
		l1.add("variables");             // String
		l1.add("java");                  // String
		l1.add("language");              // String	
		Collections.sort(l1);
       System.out.println("LinkedList    :"+ l1);

	}

}
