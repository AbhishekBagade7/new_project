package inheritance;

abstract class one
{
	abstract void three();  // no implimentation
	
	abstract void add();   // no implimentation
	
	static void two()
	{
		System.out.println("concerete static method in abtract class");
	}
}

public class Abstract_class extends one {

	public static void main(String[] args) {
		
		Abstract_class Ac1 = new Abstract_class();
		Ac1.three();
		two();
		Ac1.add();

	}	
	void three() //hidden implemention
	{
	System.out.println("implemention of abstraction");	
	}
	void add() //hidden implemention
	{
		System.out.println("implemention of abstraction1");	
	}
}
