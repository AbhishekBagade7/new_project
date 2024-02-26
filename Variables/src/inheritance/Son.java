package inheritance;

public class Son extends Parent{
	
	void add ()
	{
	System.out.println("i am son");	
	}
	public static void main(String [] args) {
		Son so = new Son();
		so.add();
		so.childs();
		
	}

}
