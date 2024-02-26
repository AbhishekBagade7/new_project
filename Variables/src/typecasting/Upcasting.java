package typecasting;
class Dec_one{
	 void upcast() 
	{
		System.out.println("one upcase");
	}
}
class Dec_Two extends Dec_one{
	 void upcast1() 
	{
		System.out.println("two upcase");
	}
}
public class Upcasting extends Dec_Two {
     void cast() 
     {
	System.out.println("three cast");
     }
	public static void main(String[] args) {
		
		Dec_Two u1 = new Upcasting();
		u1.upcast();
		u1.upcast1();
		System.out.println("    *******    ");
		 Upcasting up = (Upcasting) u1; // downcasting second class
		 up.cast();
		 up.upcast();
		 up.upcast1();
		
	}

}
