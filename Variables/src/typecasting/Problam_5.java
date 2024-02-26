package typecasting;
class One_1{
	void One(){
		System.out.println("class method one");
	}
}
class Two_2 extends One_1{
	void Two(){
		System.out.println("class method two");
	}
}
class Three_3 extends Two_2{
	void Three(){
		System.out.println("class method three");
	}
}
public class Problam_5 extends Three_3{
	void four(){
		System.out.println("class method four");
	}
	public static void main(String[] args) {
		 Two_2 t1 = new Three_3();
		 t1.Two();
		 t1.One();
		 System.out.println("   ******    ");
		 Three_3 t2 = new Problam_5();  // upcast 
		 Problam_5 p1	= (Problam_5)  t2;   // downcast can possible only when upcast is done first
		 p1.One();
		 p1.Two();
		 p1.Three();
		 p1.four();

	}

}
