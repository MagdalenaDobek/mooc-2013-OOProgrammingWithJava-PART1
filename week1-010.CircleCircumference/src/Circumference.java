
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the radius: ");
        double firstNumber = Integer.parseInt(reader.nextLine());

        final double PI = Math.PI;

        double result = 2 * PI * firstNumber;

        System.out.println("Circumference of the circle: " + result);
    }
}
