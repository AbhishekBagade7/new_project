package arrays_package;
// m1 = books
// m2 = software   o/p: softwarebooks
public class Assignement1 {

	public static void main(String[] args) {
		
    String m1 = "Books";
    String m2 = "Software";
     
    System.out.println("Assinement 1:" + m2.concat(m1));
    
    String m4 = "Software";
    String m3 = "Teting";
     
    String name = m4.concat(m3);
    System.out.println(name);
    
    for(int i=0; i<name.length(); i++) {
    	System.out.println( name.charAt(i));
    }
    String m5 = "Mom";
    String m6 = "Dad";
   //String con = m5.concat(m6);
  for(int i=0; i<m5.length(); i++)
  {
	 
  }
   for (int i =0; i<m5.length(); i++) 
   {
   System.out.println(m5.charAt(i));
   }
	}
}
