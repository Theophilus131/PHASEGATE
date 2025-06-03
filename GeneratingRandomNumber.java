import java.util.Random;
import java.util.Scanner;

public class GeneratingRandomNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int score = 0;

        for (int count = 1; count <= 10; count++) {
            int firstNumber = random.nextInt(10);  
            int secondNumber = random.nextInt(10); 

           
            if (firstNumber < secondNumber) {
                int temp = firstNumber;
                firstNumber = secondNumber;
                secondNumber = temp;
            }

            int correctAnswer = firstNumber - secondNumber;

            System.out.println("Input " + count + ": What is " + firstNumber + " - " + secondNumber + "?");

            int userInput = input.nextInt();

            if (userInput == correctAnswer) {
                System.out.println("You entered the correct answer.\n");
                score++;
            } else {
                System.out.println("You got it wrong. The correct answer was: " + correctAnswer + "\n");
            }
        }

        System.out.println("You got " + score + " out of 10 questions correct.");

    }
}
