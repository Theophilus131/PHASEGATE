
//Question 1
import java.util.Arrays;
public class Rotate{

public static void main(String [] args){


int [][] number = { {1, 2, 3}, {4,5,6}, {7,8,9} };


number [0][0] = 1;
number [0][1] = 2;
number [0][2] = 3;

number [1][0] = 4;
number [1][1] = 5;
number [1][2] = 6;

number [2][0] = 7;
number [2][1] = 8;
number [2][2] = 9;


System.out.print(number[2][0] + " ");
System.out.print(number[1][0] + " ");
System.out.print(number[0][0] + " ");

System.out.println();

System.out.print(number[2][1] + " ");
System.out.print(number[1][1] + " ");
System.out.print(number[0][1] + " ");

System.out.println();

System.out.print(number[2][2] + " ");
System.out.print(number[1][2] + " ");
System.out.print(number[0][2] + " ");




/*
for(int i = 0; i < number.length; i++){

for(int j = 0; j < number[i].length; j++){
	
	int row = i;
	int col = j;


System.out.print(number[j][i] + " ");
}
	
System.out.println();


}

*/





	}




}