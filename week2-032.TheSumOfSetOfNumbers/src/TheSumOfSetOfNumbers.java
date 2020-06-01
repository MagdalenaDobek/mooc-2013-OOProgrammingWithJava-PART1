
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Until what? ");
        int number = Integer.parseInt(reader.nextLine());
        int helper = 1;
        int sum = 0;

        while (helper <= number) {
            sum += helper;
            helper++;

        }
        System.out.println("The sum is: " + sum);
    }
}
