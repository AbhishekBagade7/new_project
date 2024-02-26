package collection_package;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.Vector;

public class Collection_program {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add("abhi");             // String
		a1.add('B');               // char
		a1.add(89);               // int
		a1.add(88.90);           // float
		a1.add(99.6789034);     // double
		a1.add("abhi");        // duplicate
		a1.add(null);         // null	
		System.out.println("ArrayList     :"+ a1);
		Vector v1 = new Vector();
		v1.add("abhi");             // String
		v1.add('B');               // char
		v1.add(89);               // int
		v1.add(88.90);           // float
		v1.add(99.6789034);     // double
		v1.add("abhi");        // duplicate
		v1.add(null);         // null
        System.out.println("Vector        :"+ v1);
       LinkedList l1 =new LinkedList();
        l1.add("abhi");             // String
		l1.add('B');               // char
		l1.add(89);               // int
		l1.add(88.90);           // float
		l1.add(99.6789034);     // double
		l1.add("abhi");        // duplicate
		l1.add(null);         // null
       System.out.println("LinkedList    :"+ l1);
      PriorityQueue  p1 = new PriorityQueue();
        p1.add("abhi");               // String
		//p1.add('B');               // char
		//p1.add(89);               // int
		//p1.add(88.90);           // float
		//p1.add(99.6789034);     // double
		p1.add("abhi");          // duplicate
		//p1.add(null);         // null
        System.out.println("PriorityQueue :"+ p1);
      TreeSet t1 =new TreeSet();
        t1.add("abhi");             // String
		//t1.add('B');               // char
		//t1.add(89);               // int
		//t1.add(88.90);           // float
		//t1.add(99.6789034);     // double
		t1.add("abhi");        // duplicate
		//t1.add(null);         // null
		System.out.println("TreeSet       :"+ t1);
		HashSet h1 = new HashSet();
		h1.add("abhi");             // String
		h1.add('B');               // char
		h1.add(89);               // int
		h1.add(88.90);           // float
		h1.add(99.6789034);     // double
		h1.add("abhi");        // duplicate
		h1.add(null);         // null
        System.out.println("HashSet       :"+ h1);
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
