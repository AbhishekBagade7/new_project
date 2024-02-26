package encapsulation_package;
class Caspul{
	private boolean value= true;
	public boolean getValue() {
		return value;
		
	}
    public void setValue(boolean value) {
		this.value=value;
	}
}
public class Encap_for_boolean {

	public static void main(String[] args) {
		Caspul c4 = new Caspul();
		c4.setValue(false);
		System.out.println("boolean value: "+c4.getValue());

	}

}
