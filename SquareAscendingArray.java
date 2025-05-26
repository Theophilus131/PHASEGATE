  import java.util.Arrays;
 public class SquareAscendingArray{

 public static int [] squareNumberAscending(int [] number){
	 
	int[] result = new int[number.length];	

	for(int i = 0; i < number.length; i++){

	 result[i] = number[i] * number[i];
			}
		
 	 return result;
}

	
public static int [] sortingArray(int [] number){

for(int index = 0; index < number.length; index++){

 for(int j = index + 1; j < number.length; j++){

      if(number[index] > number[j]){

	int temp = number[index];
	number[index] = number[j];
	number[j] = temp;
		}
}
}
	
	return number;
		
}
	public static void main(String [] args){

	//int [] input = {9,2,7,0,5};
	//System.out.print(Arrays.toString(squareNumberAscending(input)));

	int [] input = {81, 4, 49, 0, 25};
	System.out.print(Arrays.toString(sortingArray(input)));

	}
          	

}