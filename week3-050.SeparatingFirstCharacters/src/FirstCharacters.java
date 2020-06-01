import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name = reader.nextLine();

        int helper = 0;
        int length = name.length();

        if (length < 3) {
            return;
        }
        while (helper < 3) {
            System.out.println(helper + 1 + ". character: " + name.charAt(helper));
            helper++;

        }
    }
}
