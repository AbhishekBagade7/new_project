package typecasting;
class caste{
	void casting() 
	{
		System.out.println("1");
	}
}
class caste1 extends caste{
	void casting1() {
		System.out.println("2");
	}
}
class caste2 extends caste1{
	void casting2() {
		System.out.println("3");
	}
}
public class Typecast4 extends caste2{
	void casting3() {
		System.out.println("4");
	}
	public static void main(String[] args) {
		caste1	fr  = new caste2();
		fr.casting();
		fr.casting1();

	}

}
