package globalVariable;
import java.util.Scanner;
public class Calculate_with_scanner {

	public static void main(String[] args) {
		
     Scanner sc= new Scanner(System.in);
     int age = sc.nextInt();
     if (age>=18)
     {
    	 System.out.println("i am adult");
     }
     else
     {
    	 System.out.println("i am young");
     }
	}
}