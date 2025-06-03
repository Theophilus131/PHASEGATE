import java.util.Arrays;
public class UniqueNumber{

	public static int [] uniqueNumber(int [] number){


	int sum = 0;
	int count = 0;

	for(int i = 0; i < number.length; i++){
		count = 0;
	for(int j = 0; j < number.length; j++ ){
	
	if(number[i] == number[j]){
	count++;}

	
}
if (count == 1){

	sum += number[i];
		
	}

}
		return new int [] {sum};

	}

	public static void main(String [] args){
	
	int []  input = {1,2,3,2};
 
        System.out.println("The sum of the number are: " + Arrays.toString(UniqueNumber.uniqueNumber(input)));

	}

}