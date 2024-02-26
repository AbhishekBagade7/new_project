package typecasting;
class One{                 // class1
	void form() {
	System.out.println("class one method");
	}
}

class Two extends One{     // class2 inhirated class one
	
	void form2() {
	System.out.println("class two method");
	}
}

public class Upcasttype_2 extends Two{     // class3 main method
    void Min() {
    System.out.println("class three method");
    }
	public static void main(String[] args) {
		Two rf  = new Upcasttype_2();    //upcasting sub class obj to super class obj
        rf.form();             
        rf.form2();
        System.out.println("    **********    ");
        Upcasttype_2   uc1 = (Upcasttype_2) rf;  // Downcasting with explicit way
        uc1.form();
        uc1.form2();
        uc1.Min();

	}

}
