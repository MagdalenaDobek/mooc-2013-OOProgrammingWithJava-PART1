
public class Accounts {

    public static void transfer(Account from, Account to, double howMuch){
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }
    public static void main(String[] args) {
        Account firstAccount = new Account("A", 100.00);
        Account secondAccount = new Account("B", 0.00);
        Account thirdAccount = new Account("C", 0.00);

        System.out.println(firstAccount.toString());
        System.out.println(secondAccount.toString());

        transfer(firstAccount, secondAccount, 50);
        transfer(secondAccount, thirdAccount, 25);

        System.out.println(firstAccount.toString());
        System.out.println(secondAccount.toString());

    }
}