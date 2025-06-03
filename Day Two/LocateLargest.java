
import java.util.Arrays;

public class LocateLargest{


public static double [][] largestArray(double [] integer){


double largest = integer [0];


	for(int i = 0; i < integer.length; i++){

	for(int j =0; j < integer[i].length; j++){
	
	if(integer[i][j] > largest )
		largest = integer[i];
	
		}

	return new double [][] {largest};

	
}

}
	public static void main(String [] args){
	
	double [][] input = { {1.5, 2.3, 3.7, 4.6},

			{5.1, 6.2, 7.3, 8.4},
			
			{9.5, 10.1, 11.8, 12.7}
			
			};

	
 
        System.out.println("The largest number in the group: " + Arrays.toString(LocateLargest.largestArray(input)));


	



	}




	}