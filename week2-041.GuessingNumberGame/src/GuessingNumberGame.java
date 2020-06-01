
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int number;
        int guess = 0;

        while (true) {
            System.out.println("Guess a number: ");
            number = Integer.parseInt(reader.nextLine());
            guess++;

            if (number < numberDrawn) {
                System.out.println("The number is greater, guesses made: " + guess);
            } else if (number > numberDrawn) {
                System.out.println("The number is lesser, guesses made: " + guess);
            } else {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
        }

    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}