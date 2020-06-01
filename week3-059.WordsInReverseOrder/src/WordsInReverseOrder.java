import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");

        ArrayList<String> words = new ArrayList<String>();

        while (true) {
            String word = reader.nextLine();
            words.add(word);

            if (word.length() == 0) {
                break;
            }

            Collections.reverse(words);
            System.out.println("You typed the following words:");
            for (String addedWords : words) {
                System.out.println(addedWords);

            }
        }
    }
}
