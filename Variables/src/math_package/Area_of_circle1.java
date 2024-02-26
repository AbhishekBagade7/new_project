package math_package;

public class Area_of_circle1 {

	public static void main(String[] args) {
		double pai = Math.PI;	
		for(int i=0; i<=10; i++) {
			double r = Math.random();
			double d = pai*r*r;
			System.out.println("Ans:d= " +d);
		}
	}
}
