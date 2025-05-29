	import java.util.Arrays;
	public class Factor{

	 public static int [] factorOf(int [] number){
  		
		int count = 0;
  		for(int index = 0; index < number; index++ ){
  		if(number[index] % index == 0){
			count++;
  				
				}
     					}      
			return new int [] {count};
				}


	public static void main(String [] args){

	int [] input = {7};
	
	System.out.println("the factor of the numbers are: " +Arrays.toString(Factor.factorOf(input)));

	}



}