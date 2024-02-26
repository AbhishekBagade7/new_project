package arrays_package;

public class Average_findout {

	public static void main(String[] args) {
		int avg[] = new int[4];
		avg[0] = 13;
		avg[1] = 4;
		avg[2] = 5;
		avg[3] = 9;
		double d= 4; // number of arrays
		for(int i= 0; i<=avg.length-1; i++) {
			avg[i]++;
		}
		System.out.println((avg[0] + avg[1] + avg[2] +avg[3])/ +d);
		
	}
	
}
