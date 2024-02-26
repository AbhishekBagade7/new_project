package inheritance;

public class Amazon {

	public static void main(String[] args) {
		Amazon a1 = new Amazon();
		a1.login();
		a1.logout();
		a1.purchase();
		a1.payment();

	}	
	public void login() {

System.out.println("login to amazon");
		
	}	
	public void logout() {
		System.out.println("logout from amazon");	
	}
	
	 public void purchase() {
		System.out.println("i have purchased phone");
		
	}
	
	 public void payment() {
		
		 System.out.println("done payment");
	}

}
