package arrays_package;

import java.util.Date;

public class String_date_function {

	public static void main(String[] args) {
		 
		Date d1 = new Date();
		System.out.println( d1.getTime());
		Date time = new Date(d1.getTime());
		System.out.println(time);
		String t1 = time.toString();
		System.out.println( t1);
      String day = t1.substring(0, 3);
      String month = t1.substring(4, 7);
      String date1 =t1.substring(8, 10);
      String time1 = t1.substring(11, 19);
      String zone = t1.substring(20, 24);
      String year =t1.substring(24);
      System.out.println(month);
      System.out.println(day);
      System.out.println(zone);
      System.out.println(year);
      System.out.println(time1);
      System.out.println(date1);
      System.out.println( date1.concat("-").concat(month).concat("-").concat(year));
	}

}
