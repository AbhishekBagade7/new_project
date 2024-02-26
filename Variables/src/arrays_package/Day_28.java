package arrays_package;

public class Day_28 {
	public static void main(String[] args) {
		//create of arrey of length 4 of in datatype and find out of avg of those numbers
	int rollNo[] = new int[4];
    rollNo[0] =100;
    rollNo[1] =78;
    rollNo[2] =98;
    rollNo[3] =65;
   // rollNo[4] =56;
   // double average = (rollNo[0]+rollNo[1]+rollNo[2]+rollNo[3])/rollNo.length;   // length of array
    int sum =0;
    
    for (int i=0; i<rollNo.length; i++) 
    
    	sum = sum+rollNo[i] ;  
    	
   // System.out.println( "calculate average: " + average);
 System.out.println(sum);
  double average = sum/rollNo.length;
  System.out.println(average);
  
  }
	
}