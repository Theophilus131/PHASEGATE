 import org.junit.jupiter.api.Test;
 import static org.junit.jupiter.api.Assertions.assertEquals;

	public class WordTest{
	int number = 0;
	@Test
	public void testThatFunctionExist(){
		Word.occuranceWord(number);

	}

	@Test
	public void testThatFunctionCollectsInteger(){
		Word.occuranceWord(number);

	}
	
	@Test
	public void testThatFunctionReturnsCorrectCount(){
		int actual = Word.occuranceWord(number);
		int expected = 2;
		assertEquals(actual , expected);

	}


}