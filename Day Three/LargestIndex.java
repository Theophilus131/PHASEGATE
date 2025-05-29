
import java.util.Arrays;

public class LargestIndex{

public static int [] largestArray(int [] integer){


int largest = integer [0];

int count = 0;

	for(int index = 0; index < integer.length; index++){

	if(integer[index] > largest && integer[index] != largest ){
		largest = integer[index];
		count = index;
		}
}
	return new int [] {count};


}

	public static void main(String [] args){
	
	int [] input = {1, 2, 3, 4, 5, 5};

	//int [] input = {1, 2, 8, 20, 5}
        System.out.println("The smallest index of the largest number is: " + Arrays.toString( LargestIndex.largestArray(input)));

}
	}