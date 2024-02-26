package encapsulation_package;
class capsul{
	private int rollno = 223;
	public int getrollno() {
		return rollno;
	}
    public void setrollno(int rollno) {
		this.rollno = rollno;
	}
}
public class Encap_for_int {

	public static void main(String[] args) {
		capsul c2 = new capsul();
		c2.setrollno(9676);
		System.out.println(c2.getrollno());
	}

}
