package globalVariable;

import java.util.Scanner;

public class Scanner_class {

	public static void main(String[] args) {
		
       Scanner S1 = new Scanner(System.in);
       System.out.println("Eneter the byte value " );
       byte age = S1.nextByte();      
       System.out.println("Eneter the int value " );
       int in = S1.nextInt();
       System.out.println("Eneter the long value " );
       long lo = S1.nextLong();
       System.out.println("Eneter the short value " );
       short sh = S1.nextShort();
       System.out.println("Eneter the float value ");
       float fl = S1.nextFloat();
       System.out.println("Eneter the double value " );
       double d1 = S1.nextDouble();
       System.out.println("Eneter the boolean value ");
       boolean bo= S1.nextBoolean();
       System.out.println("Eneter the String value ");
       String st = S1.next();
       
	}

}
