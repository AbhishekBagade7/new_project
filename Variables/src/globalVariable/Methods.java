package globalVariable;


public class Methods {

	
	protected void add()
	{
		System.out.println("hello");
	}
	public static void sub()
	{
		Methods m1 = new Methods();
		m1.add();
		m1.multip();
		m1.divs();
		System.out.println("i am sub method");
	}
	private void divs() {
		System.out.println("division");
	}
	void multip() {
		System.out.println("multiple");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sub();
		
	}

}
