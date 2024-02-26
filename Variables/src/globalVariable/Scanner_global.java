package globalVariable;
import java.util.Scanner;
public class Scanner_global {	
//	static Scanner S2 = new Scanner(System.in);
//	static  int a =S2.nextInt();
//	 static int b=S2.nextInt();
static void div()
     {
	Scanner S2 = new Scanner(System.in);
	int a = S2.nextInt();
	int b = S2.nextInt();
	 double c = a / b;
	System.out.println("print a/b " +c);
      }
static void multi()
    {
	Scanner S2 = new Scanner(System.in);
	int a = S2.nextInt();
	int b = S2.nextInt();
 	int multi = a*b;
	System.out.println("print a*b "+multi);
     }
static void add()
   {
	Scanner S2 = new Scanner(System.in);
	int a = S2.nextInt();
	int b = S2.nextInt();
	int add = a+b;
	System.out.println("print a+b "+add);
   }
static void sub()
   {
	Scanner S2 = new Scanner(System.in);
	int a = S2.nextInt();
	int b = S2.nextInt();
	int sub = a-b;
	System.out.println("print a-b "+sub);
    }
	public static void main(String[] args) {				
		div();
		multi();
		add();
		sub();
	}

}