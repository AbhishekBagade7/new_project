package globalVariable;
public class Circumstance_of_circle {
 final  double pi=3.14;  //non static final variable
static void Circumstance()
{
		int r = 7;
	Circumstance_of_circle C1 = new Circumstance_of_circle();
	double ci = 2*C1.pi*r;
	System.out.println("Circumstance of circle = " + ci);
}	
	public static void main(String[] args) {
		Circumstance();
	}
}
