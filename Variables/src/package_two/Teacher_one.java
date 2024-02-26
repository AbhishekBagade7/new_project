package package_two;

import package_one.Student_one;

public class Teacher_one {

	public static void main(String[] args) {
		Second_class cs = new Second_class();   // calling default class within package
		cs.Two();                               //default class method 
		Student_one s1 =new Student_one();    // calling public class outside the package
		s1.rollNo_one();                     
		// calling public class method outside the package this only can access which is public methods  		
	}

}
