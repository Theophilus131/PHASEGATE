import java.util.Arrays;

public class Factor{

    public static int[] factorOf(int [] number) {
       
	 int num = number[0];
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }


        int [] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    public static void main(String[] args) {
        int[] input = {7};
        System.out.println("The factors of the number are: " + Arrays.toString(Factor.factorOf(input)));
    }
}
