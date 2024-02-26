package math_package;

public class Fibonacci_series {

	public static void main(String[] args) {
		int fibon=1;
		int ser =1;
		int tot =fibon*ser;
		for(int i=0; i<=100; i++) {
			fibon++;
			System.out.println((i+fibon)*ser);	  //(0+1)*1=1, (1+1)*1=1, (1+1)*1=2, 
			
		//0+1*1=1 0+2*2=
			
			//0+1+1+2=3+2=5+3=8+5=13+8=21 //1+1=2 ,  2+1=3, 3+2=5
		}
		
	}

}
