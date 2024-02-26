package globalVariable;
class One_class 
{
	One_class(int a)
	{
		System.out.println("I am constructor method");
	}
	static void add() 
	{
		System.out.println("class one");
	}
}
class Second_class 
{
	
	void sub() 
	{
		System.out.println("second class");
	}
}

public class Two_classes {
	
	public static void main(String[] args) {
		Second_class sc = new Second_class();
		
		
		

	}

}
