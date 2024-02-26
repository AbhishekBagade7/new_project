package arrays_package;

import java.lang.reflect.Array;

public class Findout_index_array 
{
	
	public static void main(String[] args) 
	{
		int num[] = {20, 33, 41, 44, 45, 42};
		int index=0;
		int no = 41; 
        
		for(int i=0; i<num.length; i++)
		{
			if(num[i]==no) 
			{
				 System.out.println("The given index is on "+i);	
			}
			
		}
		
		

	}

}
