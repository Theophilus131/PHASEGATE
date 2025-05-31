        import org.junit.jupiter.api.Test;
        import static org.junit.jupiter.api.Assertions.assertArrayEquals;

	public class LargestElementTest{


 @Test
   public void testLargestElementIsCorrect(){	

 	int [] input = {1, 5, 3, 4, 5, 5};
		
	int [] actual = LargestIndex.largestArray(input);

	int []  expected = {1};
  	
	assertArrayEquals(actual, expected);
}


 @Test
   public void test2LargestElementIsCorrect(){

	int [] input = {1, 2, 8, 20, 5};
	int [] expected = {3};
  	
	int [] actual = LargestIndex.largestArray(input);

	assertArrayEquals(actual, expected);

	}

@Test
   public void testNagetiveLargestElementIsCorrect(){

	int [] input = {-1, -20, -8, -40, -5};
	int [] expected = {0};
  	
	int [] actual = LargestIndex.largestArray(input);

	assertArrayEquals(actual, expected);

	}

		
}