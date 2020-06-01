
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        System.out.print("Enter the last number: ");
        int lastNumber = Integer.parseInt(reader.nextLine());
        int numberDisplayed = firstNumber;

        while (numberDisplayed <= lastNumber) {
            System.out.println(numberDisplayed);
            numberDisplayed++;
        }
    }
}
