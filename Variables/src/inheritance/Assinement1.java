package inheritance;
class one1
{
	static void login()
     {
    	 System.out.println("non static method");
     }
      void otp()
     {
    	 System.out.println("otp method");
     }
}
abstract class two extends one1{
	abstract void logout();
	void login(int a)
    {
   	 System.out.println("concerete method");
    }
}
public class Assinement1 extends two{
	
    void in_child_class() {
    	System.out.println("child class method");
    }
    void in_child_class2() {
    	System.out.println("second child class method");
    }
	public static void main(String[] args) {
		
		Assinement1 A2 = new Assinement1();
		A2.logout();
		A2.in_child_class();
		login();
		A2.otp();
		A2.in_child_class2();
		logout(1);
	}
	
	void logout() {
		System.out.println("abtract method");
		
	}
	static void logout(int e) {
		e =5;
		System.out.println(5);
		
	}

}
