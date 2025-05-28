import java.util.Arrays;
public class UniqueNumber{

	public static int [] uniqueNumber(int [] integer){

 
	int [] number = {1,2,3,4}; 

	int sum = 0;
	int count = 0;

	for(int i = 0; i < number.length;){

	for(int j = 0; j < number.length; ){
	
	if(number[i] == number[j]){
	count++;}

	if (count == 1){

	sum += count;
		
	}
}

}
		return new int [] {sum};

	}

	public static void main(String [] args){
	
	int []  input = {1,2,3,2};
 
        System.out.println("The sum of the number are: " + Arrays.toString(UniqueNumber.uniqueNumber(input)));

	}

}