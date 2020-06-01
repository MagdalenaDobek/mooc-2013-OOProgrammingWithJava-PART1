
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name: ");
        String nameOfFirstPerson = reader.nextLine();
        System.out.print("Type yout age: ");
        int ageOfFirstPerson = Integer.parseInt(reader.nextLine());

        System.out.println("Type your name: ");
        String nameOfSecondPerson = reader.nextLine();
        System.out.print("Type yout age: ");
        int ageOfSecondPerson = Integer.parseInt(reader.nextLine());

        int result = ageOfFirstPerson + ageOfSecondPerson;
        System.out.println(nameOfFirstPerson + " and " + nameOfSecondPerson + " are " + result + "years in total.");
    }
}
