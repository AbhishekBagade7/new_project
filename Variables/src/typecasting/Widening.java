package typecasting;

public class Widening {

	public static void main(String[] args) {
	
		int weight = 78;
		System.out.println(weight);
		double d = weight;    //converting int(smaller) to double(bigger) implicit way
		System.out.println(d);
		byte wit = (byte) d;    // converting double(bigger) to int(smaller) by explicit way
		System.out.println(wit);
		wit= 127;   // changing value
		System.out.println(wit);
	}

}
