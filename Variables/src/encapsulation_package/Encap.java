package encapsulation_package;
class capsule{
	private String username = "abc@grotechmind.com";
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}	
}
public class Encap {

	public static void main(String[] args) {
		capsule c1 = new capsule();
		c1.setUsername("abhishekp@gmail.com");
		System.out.println(c1.getUsername());		
	}
}
