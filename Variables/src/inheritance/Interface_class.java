package inheritance;

interface State
{
    void dist();
	void town();
}
interface Country
{
	void dis();
	void ton();
}
interface Pin
{
	void dit();
	void twn();
}
interface Code
{
	void dst();
	void tow();
}
public class Interface_class implements Country,Pin,Code,State{

	public static void main(String[] args) {
		Interface_class i1 = new Interface_class();
         i1.dist();
         i1.town();
         i1.dst();
         i1.tow();
         i1.dit();
         i1.twn();
         i1.dis();
         i1.ton();
	}
	public void dist() {
		System.out.println("heelo1");
		
	}
	public void town() {
		System.out.println("heelo2");
	}
	public void dst() {
		System.out.println("heelo3");
	}
	public void tow() {
		System.out.println("heelo4");
	}
	public void dit() {
		System.out.println("heelo5");
	}
	public void twn() {	
		System.out.println("heelo6");
	}
	public void dis() {	
		System.out.println("heelo7");
	}
	public void ton() {
		System.out.println("heelo8");
		
	}

}
