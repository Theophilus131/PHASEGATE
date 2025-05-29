import org.junit.jupiter.api.Test;
        import static org.junit.jupiter.api.Assertions.assertArrayEquals;

	public class FactorTest{

 @Test
   public void testsortedElementIsCorrect(){

 	int []  input = {7};
	int [] expected = {1, 7};
  	
	Factor number = new Factor();

	int [] actual =  number.factorOf(input);
	int [] check = number.factorOf(actual);

	assertArrayEquals(expected, check);
}

}