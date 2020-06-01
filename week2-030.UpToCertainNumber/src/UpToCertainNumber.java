
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int lastNumber = Integer.parseInt(reader.nextLine());
        int number = 1;

        while (number <= lastNumber) {
            System.out.println(numberDisplayed);
            number++;
        }
        
    }
}
