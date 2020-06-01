
public class Accounts {

    public static void main(String[] args) {
        Account firstAccount = new Account("Matt's account", 1000.00);
        Account secondAccount = new Account("My account", 0.00);

        System.out.println(firstAccount);
        System.out.println(secondAccount);

        firstAccount.withdrawal(100);
        secondAccount.deposit(100);

        System.out.println(firstAccount);
        System.out.println(secondAccount);
    }

}
