
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        Account firstAccount = new Account("First Account", 100.00);

        System.out.println(firstAccount);

        firstAccount.deposit(20);
        System.out.println(firstAccount);


    }
}
