package globalVariable;

public class Area_of_circle2 {
	final static double pi = 3.14;
	void sub() {
		int r =7;
		double d = pi*r*r;
		System.out.println(d);
	}
	void add() {
		int r =14;
		double d = pi*r*r;
		System.out.println(d);
	}
 public static void main(String[] args) {
	 Area_of_circle2 a2 = new Area_of_circle2();
	 a2.sub();
	 a2.add();
}

}
