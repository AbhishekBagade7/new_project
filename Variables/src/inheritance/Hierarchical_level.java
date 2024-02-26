package inheritance;
class Par11
{
	void town()
	     {
		System.out.println("I am the parent class method");
	      }
}
class Chi11 extends Par11
{
	 void park()
	    {
		System.out.println("I am the child 1 class method i can inhirite my parent");
	     }
	
}
class E11 extends Par11
{
     void chai()
           {
    	 System.out.println("I am the child 2class method so i also  inhirite my parent");
           }
}
public class Hierarchical_level {

	public static void main(String[] args) {
	System.out.println("I am in main method");	
	E11 S11 = new E11();    // obj created for child 2
	S11.town();
	S11.chai();
	Chi11 c1 = new Chi11();  // ojb created for child 1
	c1.park();
	c1.town();
	}

}
