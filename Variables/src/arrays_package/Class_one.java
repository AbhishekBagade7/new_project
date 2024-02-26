package arrays_package;
class Four{
	void sub() {
		System.out.println("class four");
	}
}
class Three extends Four{
	void multi() {
		System.out.println("class three");
	}
}
class Two extends  Three{
void add() {
	System.out.println("class one");
}
}
public class Class_one extends Two {

	public static void main(String[] args) {
		Class_one c1 = new Class_one();
       c1.add();
       c1.multi();
       c1.sub();
	}

}
