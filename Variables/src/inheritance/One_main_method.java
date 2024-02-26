package inheritance;

public class One_main_method extends One_abstract {

	public static void main(String[] args) {
		
		One_main_method o1 =new One_main_method();
		o1.concrate();
         o1.hello();
         o1.inner();
         
	}

	
	void hello() {
		System.out.println("i am in abstract class");
		
	}


	
	public void inner() {
		System.out.println("i am in infercae class");
		
	}

	
	

}
