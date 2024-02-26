package arrays_package;
/*WAP to print 
1 2 3 4
5 6 7
8 9 
10*/
public class One_Two_Three {

	public static void main(String[] args) {
	int k=0;
		for( int i=1; i<=4; i++) {  //loop for 4 times			
			 for(int j=i; j<=4;j++) {   //loop minus it for everytime
				System.out.print(j);
			k++;
			}
			 System.out.println("");
		}
		

	}

}
