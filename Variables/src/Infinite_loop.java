
public class Infinite_loop {

	public static void main(String[] args) {
		for(int i=1; i>0; i++) {   // 1>0 true i++=1+1, 2>0 true i++=2+1=3 3>0true...
			System.out.println(i);
		}

	}

}
