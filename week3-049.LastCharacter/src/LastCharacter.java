import java.util.Scanner;


public class LastCharacter {

    public static char lastCharacter(String text) {
        int word = text.length()-1;
        return text.charAt(word);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        System.out.println("Last character: " + lastCharacter(reader.nextLine()));
    }

}
