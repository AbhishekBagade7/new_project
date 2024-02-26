package typecasting;
class Wide{
	void cast() {
		System.out.println("1");
	}
	
}
class Wide2 extends Wide{
	void cast2() {
		System.out.println("2");
	}
	
}
public class Typethree extends Wide2{
	class Wide3{
		void cast3() {
			System.out.println("3");
		}
		
	}
	public static void main(String[] args) {
		Wide w1 = new  Typethree();
		w1.cast();
		
	}

}
