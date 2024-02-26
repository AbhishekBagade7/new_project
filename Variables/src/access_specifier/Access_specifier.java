package access_specifier;
public class Access_specifier {
	private void five()
	{
		System.out.println("private");
	}
  public void  abhi()
  {
	  System.out.println("public");
  }
   protected static void four()
   {
	   System.out.println("protected");
   }
   void def()
   {
	   System.out.println("default");
   }
	
	public static void main(String[] args) {
		
	    Access A1 = new Access();
		A1.four();
		A1.def();
		A1.abhi();
		
	}

}
