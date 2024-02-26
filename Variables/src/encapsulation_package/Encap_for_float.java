package encapsulation_package;
class Encap22{
	private float salary = 45.56f;
	public float getSalary() {
		return salary;
		
	}
	public void setSalary(float salary) {
		this.salary=salary;
	}
}
public class Encap_for_float {

	public static void main(String[] args) {
		Encap22 e3 = new Encap22();
		e3.setSalary(998.56f);
		System.out.println("float salary "+e3.getSalary());

	}

}
