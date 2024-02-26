package viva;

public class Program {
//WAP Pallandtom or String RADAR
	public static void main(String[] args) {
		String name = "radar";
		String value = "";
		for(int i=name.length()-1; i>=0; i--) {
			//char c = name.charAt(i);
			value = value+name.charAt(i);						
		}
		if(value.equals(name)) {
			System.out.println("pallandrom is true");
		}
		else {
			System.out.println("not pallandrom");
		}
	

	}

}
