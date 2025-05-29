  import java.util.Arrays;

 public class Unsorted{
	
public static int [] sortingArray(int [] number){

for(int index = 0; index < number.length; index++){

 for(int j = index + 1; j < number.length; j++){

      if(number[index] < number[j]){

	int temp = number[index];
	number[index] = number[j];
	number[j] = temp;
		}
}
}
	
	return number;
		
}
	public static void main(String [] args){

	//int [] input = {3, 1, 5, 8, 6, 4};
	//System.out.print(Arrays.toString(Unsorted.sortingArray(input)));

	int [] input = {7, 4, 1, 9, 3, 2};
	System.out.print(Arrays.toString(Unsorted.sortingArray(input)));


	
	}
          	

}