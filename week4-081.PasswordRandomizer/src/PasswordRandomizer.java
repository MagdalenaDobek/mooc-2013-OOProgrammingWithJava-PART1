import java.util.Random;

public class PasswordRandomizer {
    private Random random = new Random();
    private int passwordLength;

    public PasswordRandomizer(int length) {
        this.passwordLength = length;
    }

    public String createPassword() {
        String characters = "abcdefghijklmnopqrstuvwxyz";

        String password = "";
        int numberOfCharacters = this.passwordLength;

        while (numberOfCharacters > 0) {
            int randomInt = this.random.nextInt(characters.length());
            char randomCharacter = characters.charAt(randomInt);
            password = password + randomCharacter;
            numberOfCharacters--;
        }

        return password;

    }
}
