package revesion;

public class Odd_num {

	public static void main(String[] args) {
		int arr[] = {2,4,3,5,6,33,56, 23,56,512,87};
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 == 0) {
				System.out.println("even num " +arr[i]);				
			}
			else {
			System.out.println("odd number" + arr[i]);
			}
		}
	}

}
