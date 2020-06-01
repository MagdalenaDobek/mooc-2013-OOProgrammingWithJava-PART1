import java.util.Scanner;

public class Palindromi {

    public static String reversed(String text) {
        int charNumber = text.length()-1;
        int length = text.length();
        String reverse = "";
        while (length > charNumber){
            reverse = reverse + (text.charAt(charNumber));
            charNumber--;
            if (charNumber < 0) {
                break;
            }
        }
        return reverse;
    }


    public static boolean palindrome(String text) {
        boolean isPalindrome = text.equals(reversed(text));
        return isPalindrome;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}