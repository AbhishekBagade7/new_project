package inheritance;

public class Muiti_level implements Interface01_class, Interface02_class, Interface03_class, Interface04_class {

	public static void main(String[] args) {
		Muiti_level m1 = new Muiti_level();
m1.Ball();
m1.Bat();
m1.Tennies();
m1.batmanton();
m1.cricket();

	}	
	public void Tennies() {
		System.out.println("i am second interface class");		
	}	
	public void Ball() {
		System.out.println("i am first interface class");
	}	
	public void Bat() {		
		System.out.println("i am first interface class and second method");
	}
	public void batmanton() {
		System.out.println("fourth interface class");	
	}
	public void cricket() {
		System.out.println("third interface class");		
	}
}
