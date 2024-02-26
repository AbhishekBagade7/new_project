package typecasting;

class Down {
	void don() {
		System.out.println("downcasting");
	}	
}
public class Downcasting extends Down{

	public static void main(String[] args) {		
		Down 	dw = new Downcasting();
        dw.don();
	}

}
