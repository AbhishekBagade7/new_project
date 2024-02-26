package typecasting;

public class Narrowing {

	public static void main(String[] args) {
        double d= 222.4;
        System.out.println("double is "+d);
        float f = (float) d;
        System.out.println("change to float "+f);
		long a =(long) f;
		System.out.println("change to long "+a);
		short s = (short) a;	
		s=14220;
		System.out.println("change to short "+s);
		byte b = (byte) s;
		System.out.println("change to byte "+b);
		b= 127;
		System.out.println(b);
	}

}
