import org.junit.jupiter.api.Test;
        import static org.junit.jupiter.api.Assertions.assertArrayEquals;

	public class FactorTest{

 @Test
   public void testfactorElementIsCorrect(){
	int [] num = {7};
	int [] input = Factor.factorOf(num);
	int [] expected = {1, 7} ;
	assertArrayEquals(input, expected);

}

@Test
   public void testEmptyArrayElementIsCorrect(){
	int [] num = {};
	int [] input = Factor.factorOf(num);
	int [] expected = {} ;
	assertArrayEquals(input, expected);


}

}