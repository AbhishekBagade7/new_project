package revesion;

public class Print_reverse_string {

	public static void main(String[] args) {
		String name = "Abhishek";
		String reverse ="";
		for(int i=name.length()-1; i>=0; i--) 
		{
			char nav = name.charAt(i);
			reverse=reverse+nav; 
		}
		System.out.println(reverse);
	}

}
