import org.junit.jupiter.api.Test;
        import static org.junit.jupiter.api.Assertions.assertArrayEquals;

	public class UnsortedTest{

 @Test
   public void testsortedElementIsCorrect(){

 	int [] input = {3,1,5, 8,6,4};
	int [] expected = {8,6,5,4,3,1};
  	
	Unsorted sorted = new Unsorted();

	int [] actual = sorted.sortingArray(input);
	int [] check = sorted.sortingArray(actual);

	assertArrayEquals(expected, check);
}


@Test
   public void test2sortedElementIsCorrect(){

 	int [] input = {7,4,1, 9,3,2};
	int [] expected = {9,7,4,3,2,1};
  	
	Unsorted sorted = new Unsorted();

	int [] actual = sorted.sortingArray(input);
	int [] check = sorted.sortingArray(actual);

	assertArrayEquals(expected, check);
}








	}