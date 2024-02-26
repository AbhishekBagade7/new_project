package arrays_package;

public class Remove_cap_small {

	public static void main(String[] args) {
		String a = "GoTechMinds";
		String b = "GoTechMinds";
		System.out.println("Output1: "+ a.replaceAll("[a-z]", " "));
		System.out.println("Output2: "+b.replaceAll("[A-Z]", " "));
	}

}
