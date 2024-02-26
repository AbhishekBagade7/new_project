package inheritance;

public class Class_ab extends Abstract_ab {
	static void add() 
	{
	System.out.println("add class");	
	}
	 void sub()
	{
		System.out.println("sub class");
	}
	public static void main(String[] args) 
	{ 
		
		Class_ab ca1= new Class_ab();
		ca1.sub();
		add();
		ca1.multiple();
		ca1.division();
		
	}
	
	void multiple() {
		
		System.out.println("i am implementaion of abstract method");
	}
	
	void division() {
		
		System.out.println("i am division implementaion of abstract method");
	}

}
