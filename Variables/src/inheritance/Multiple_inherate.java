package inheritance;
class grandparent
{
 void gp()
 {
	 System.out.println("i am grandparent");
 }
}
class parent1 extends grandparent
{
void par()
{
	System.out.println("i am parent");
}
}
class parent2 extends parent1
{
	void sub22()
	{
		System.out.println("can i call parent");
	}
}

public class Multiple_inherate extends parent2{
	 int a;  // variable
	 void function()
	 {
	   System.out.println("i am in child function");   
	   }
	public static void main(String[] args)
	{
		Multiple_inherate m1 = new Multiple_inherate();
		m1.a=9;
		m1.par();
		m1.sub22();
		m1.gp();
		m1.function();
		System.out.println(m1.a);
	
		
		
 }

}
