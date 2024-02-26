package arrays_package;



public class Alpha_numeric {

	public static void main(String[] args) {
		 
		String name = "Abhishek1234";
	    int numofchar= 0;
	    int numofdigit =0;
	    for(int i=0; i<=name.length()-1; i++) {
	    	char cr = name.charAt(i);
	    	boolean br = Character.isDigit(cr);
	    	if(br==true) {
	    		numofdigit++;
	    	}
	    	else {
	    		numofchar++;
	    	}
	    }
	    System.out.println("num of char " +numofchar);
    	System.out.println("num of digit " +numofdigit);
	}

}
