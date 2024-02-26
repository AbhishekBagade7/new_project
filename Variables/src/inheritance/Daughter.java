package inheritance;

public class Daughter extends Parent{

	static void married()
	{
		System.out.println("i have son");
			
	}
	public static void main(String [] args) {
		Daughter D1 =new Daughter();
		D1.childs();
		married();
	}
}
