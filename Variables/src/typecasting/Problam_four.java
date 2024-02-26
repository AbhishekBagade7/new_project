package typecasting;
class One_One{
	void One1() {
		System.out.println("class one");
	}
}
class One_Two extends One_One {
	void One2() {
		System.out.println("class two");
	}
}
class One_Three extends One_Two{
	void One3() {
		System.out.println("class three");
	}
}

public class Problam_four extends One_Three {
	void One4() {
		System.out.println("class four");
	}
	public static void main(String[] args) {
		One_Two Ot = new	One_Three();
		Ot.One1();
		Ot.One2();
		System.out.println("  *****   ");
		One_Three o3 = (One_Three) Ot; 
		o3.One1();
		o3.One2();
		o3.One3();

	}

}
