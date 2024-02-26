package globalVariable;

public class Non_static_Global_variable {
 int a;
int b;
 
 void sub() {
	a= 100; 
	 System.out.println(a-b);  //100-300 =-200
 }
 void add()
 {
	 b=300;
	 a=200;
	 System.out.println(b+a);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Non_static_Global_variable GV1 = new Non_static_Global_variable();
		GV1.add();
		GV1.sub();
		
	}

}
