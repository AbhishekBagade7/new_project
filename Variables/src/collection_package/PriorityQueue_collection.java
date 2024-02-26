package collection_package;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueue_collection {

	public static void main(String[] args) {
		PriorityQueue  p1 = new PriorityQueue();
        p1.add("abhi");               // String
		//p1.add('B');               // char
		//p1.add(89);               // int
		//p1.add(88.90);           // float
		//p1.add(99.6789034);     // double
		p1.add("abhi");          // duplicate
		//p1.add(null);         // null
        System.out.println("PriorityQueue :"+ p1);
        p1.add("collection");            // String
		p1.add("abstraction");           // String
		p1.add("interface");             // String
		p1.add("variables");             // String
		p1.add("java");                  // String
		p1.add("language");              // String	
		//Collections.sort(p1);
		System.out.println(p1);

	}

}
