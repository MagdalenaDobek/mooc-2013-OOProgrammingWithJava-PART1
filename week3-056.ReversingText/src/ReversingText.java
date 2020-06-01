
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string

        int length = text.length();
        int charNumber = length - 1;
        String help = "";
        while (length >= 0){
            help += text.charAt(charNumber);
            charNumber--;
        }

        return help;

    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.print("In reverse order: " + reverse(text));
    }

}
