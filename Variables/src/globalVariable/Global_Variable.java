package globalVariable;

public class Global_Variable {
static int a; 
static int b;


 void add()
{
	a=100;
	b=200;
	System.out.println(a+b); //
	}
static void sub()
{
	a=1000;
	b=2200;
	System.out.println(a-b); //1000-2200= -1200
	}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
        sub();
        Global_Variable a1= new Global_Variable();
        a1.add();
	}

}
