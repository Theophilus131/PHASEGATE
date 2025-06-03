 import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.*;
        //import static org.junit.jupiter.api.Assertions.assertArrayEquals;

	public class RotatingArrayTest{


 	@Test
   	public void testArrayRotateClockwiseIsCorrect(){	

	TwoDClockwise.rotateClockwise(new int[][]{{1, 2, 3},{4, 5, 6},{7, 8, 9}});

}

	
 	@Test
   	public void testFunctionIsCorrect(){	

	int  [][] input= {{1, 2, 3},{4, 5, 6},{7, 8, 9}};

	int [][] actual = TwoDClockwise.rotateClockwise(input);
	int [][] expected =  {{7, 4, 1},{8, 5, 2}, {9, 6, 3 }};

	assertArrayEquals(actual, expected);

}
	
    @Test
    public void testEmptyArrayIsCorrect() {
        int[][] input = new int[0][0];
        int[][] actual = TwoDClockwise.rotateClockwise(input);
        int[][] expected = new int[0][0];

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testNullInputReturnsNull() {
        int[][] input = null;
        int[][] actual = TwoDClockwise.rotateClockwise(input);

        assertNull(actual);
    }





	}