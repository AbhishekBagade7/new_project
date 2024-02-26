package string_methods;

public class If_and_block {

	public static void main(String[] args) {
		int a = 40;
		int b = 60;
		if(a>40 || b<60) {
			System.out.println("1");
		}
		if(a>40 && b<60) {
			System.out.println("2");
		}
		if(!(a>40 || b<60)) {
			System.out.println("3");
		}
		if(!(a>40 || b<60)) {
			System.out.println("4");
		}
	}

}
