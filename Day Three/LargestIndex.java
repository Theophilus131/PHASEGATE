import java.util.Arrays;

public class LargestIndex {

    public static int[] largestArray(int [] integer) {
        int largest = integer[0];
        int indexOfLargest = 0;

        for (int index = 1; index < integer.length; index++) {
            if (integer[index] > largest) {
                largest = integer[index];
                indexOfLargest = index;
            }
        }

        return new int[] { indexOfLargest };
    }

    public static void main(String[] args) {
        int[] input = {1, 5, 3, 5, 5, 5};
       
	 // int[] input = {1, 2, 8, 20, 5};

        System.out.println("The smallest index of the largest number is: " + 
            Arrays.toString(LargestIndex.largestArray(input)));
    }
}
