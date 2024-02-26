package string_methods;
class Super{
	Super(){
		System.out.println("1");
	}
}
class Second extends Super{
	Second(){
		super();
		System.out.println("2");
	}
}
public class SuperCalling extends Second{
	SuperCalling(){
		super();
		System.out.println("3");
	}
	public static void main(String[] args) {
		new SuperCalling();
		String a = "Assam";
		a.indexOf('s');
		System.out.println(a.indexOf('s'));
		

	}

}
