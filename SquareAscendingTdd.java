        import org.junit.jupiter.api.Test;
        import static org.junit.jupiter.api.Assertions.assertArrayEquals;

	public class SquareAscendingTdd{

 @Test
   public void testSquareAscendingIsCorrect(){

 	int [] input = {9, -2, 7, 0, -5};
	int [] expected = {0, 4, 25, 49, 81};
  	
	SquareAscendingArray square = new SquareAscendingArray();

	int [] actual = square.squareNumberAscending(input);
	int [] check = square.sortingArray(actual);

	assertArrayEquals(expected, check);

	}
}