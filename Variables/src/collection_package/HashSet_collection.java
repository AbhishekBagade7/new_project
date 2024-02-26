package collection_package;

import java.util.Collections;
import java.util.HashSet;

public class HashSet_collection {

	public static void main(String[] args) {
		HashSet h1 = new HashSet();
		h1.add("abhi");             // String
		h1.add('B');               // char
		h1.add(89);               // int
		h1.add(88.90);           // float
		h1.add(99.6789034);     // double
		h1.add("abhi");        // duplicate
		h1.add(null);         // null
        System.out.println("HashSet       :"+ h1);
        

	}

}
