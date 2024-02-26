package access_specifier;

public class Access {
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
	   Access as =new Access();
	   as.abhi();
	   as.def();
	   as.four();
	   as.five();
}
}
