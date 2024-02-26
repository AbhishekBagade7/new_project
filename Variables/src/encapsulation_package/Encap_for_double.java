package encapsulation_package;
class Encap11{
	private double salary = 65.7789;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}

public class Encap_for_double {

	public static void main(String[] args) {
		Encap11 e1 = new Encap11();
		e1.setSalary(967.6356005);
		System.out.println("double value " +e1.getSalary());
	}
}
