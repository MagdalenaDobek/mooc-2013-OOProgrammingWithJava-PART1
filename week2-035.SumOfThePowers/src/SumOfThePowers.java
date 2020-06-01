
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        int power = 0;
        int sum = 0;
        int helper = 0;

        while (power <= number) {
            power = (int)Math.pow(2, power);
            sum += power;
            helper++;
        }
        System.out.println("The result is " + sum);


    }
}
