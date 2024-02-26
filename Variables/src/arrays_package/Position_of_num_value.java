package arrays_package;
public class Position_of_num_value {

	public static void main(String[] args) {
		String alphanum = "abhishek34567";		
		for(int i=0; i<alphanum.length(); i++) {	
			char ch =  alphanum.charAt(i);
			boolean tr = Character.isDigit(ch);
			if(tr==true) {
				System.out.println("i am the numberic position on: "+i);	
			}
			else {
				System.out.println("i am char");
			}
		}

	}

}
