import java.util.Random;
import java.util.Scanner;

public class GeneratingRandomNumber{

Random random = new Random();

public static int randomnumber(int firstNumber, int secondNumber2){

firstNumber = random.nextInt(1, 100);

secondNumber = random.nextInt(1, 100);

int subtraction = 0;

if(firstnumber > secondnumber)
subtraction = number1 - number2;

return subtraction;

}

public static void main(String [] args){

Scanner input = new Scanner(System.in);

int count = 0;

for(int  countAns = 1; countAns <= 10; countAns++){

 System.out.println("what will be the answer when this two numbers are subtracted: ");
 int answer = random();

 System.out.println("input the subtraction of this two numbers: " )
 int userinput = input.nextInt();

 if (answer == userinput){

 System.out.println("you entered the correct ans: ");
}

else if(answer != userinput){ 
System.out.println("You got the answer wrong, try again: ")}

}

	

	}


