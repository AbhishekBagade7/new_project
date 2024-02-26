package typecasting;

public class wider {

	public static void main(String[] args) {
		byte age = 48;
		System.out.println("byte type: "+age);
		double bi = age;
		System.out.println("converted to double type: "+bi);
		bi=40.7890;
		System.out.println("converted to double type: "+bi);
		int con= (int) bi;
		System.out.println("converted to int type: "+con);
        byte by= (byte) bi;
        System.out.println("converted to byte type: "+by);
        by=127;
        System.out.println("changing byte value: "+by);
        
	}

}
