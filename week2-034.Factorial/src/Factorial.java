import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        int helper = 1;
        int factorial = 1;

        while (helper <= number) {
            factorial *= helper;
            helper++;
        }
        System.out.println("Factorial is " + factorial);
    }
}
