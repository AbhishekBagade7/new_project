package encapsulation_package;
class capul{
	private char surename= 'A';
	public char getSurename() {
		return surename;		
	}
	public void setSurename(char surename) {		
		this.surename= surename;		
	}
}
public class Encap_for_char {

	public static void main(String[] args) {
		capul c3 = new capul();
		c3.setSurename('S');
		 System.out.println("char: "+ c3.getSurename());

	}

}
