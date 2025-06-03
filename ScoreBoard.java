import java.util.Arrays;

public class ScoreBoard{

public static int [] studentScoreBoard(int [] score){

	int [][] total = new int[score.length];

	for(int i = 0; i < score.length; i++){

	total += score.length;	
	}

	return total;
	}

	

 	public static void main(String [] args){

	int [][] input = { {3, 3, 4}, {9, 1, 3} };

	System.out.println(System.out.print(Arrays.toString(studentScoreBoard(input))));
}


	}