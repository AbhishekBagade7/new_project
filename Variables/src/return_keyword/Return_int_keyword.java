package return_keyword;


public class Return_int_keyword {
	 int add(int a, int b) {
		int sum = a +b;
		return  sum;	
	}
	 double sub(int a, double b) {
		 double sub =a-b;
		 return sub;
		}

	public static void main(String[] args) {
		Return_int_keyword rt= new Return_int_keyword();
		double dr = rt.sub(10, 6.76);
		int in=  rt.add(44, 6);
		System.out.println(dr);
		System.out.println(in);

	}

}
