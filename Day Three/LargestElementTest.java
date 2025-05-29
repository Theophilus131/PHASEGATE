        import org.junit.jupiter.api.Test;
        import static org.junit.jupiter.api.Assertions.assertArrayEquals;

	public class LargestElementTest{

 @Test
   public void testLargestElementIsCorrect(){

 	int [] input = {1, 5, 3, 4, 5, 5};
	int  expected = 1;
  	
	LargestIndex largest = new LargestIndex();

	int [] actual = largest.largestArray(input);
	int  check = largest.largestArray(actual);

	assertArrayEquals(expected, check);
}


 @Test
   public void test2LargestElementIsCorrect(){

	int [] input = {1, 2, 8, 20, 5};
	int expected = 3;
  	
	LargestIndex largest = new LargestIndex();

	int [] actual = largest.largestArray(input);
	int  check = largest.largestArray(actual);

	assertArrayEquals(expected, check);




	}
}