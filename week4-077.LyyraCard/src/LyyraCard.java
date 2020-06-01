public class LyyraCard {
    private double balance;
    private final double ECONOMICAL = 2.5;
    private final double GOURMET = 4.0;


    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;

    }
    public void decrease(double decreaseAmount) {
        if (this.balance >= decreaseAmount){
            balance -= decreaseAmount;
        }
    }

    public void payEconomical() {
        decrease(ECONOMICAL);
    }

    public void payGourmet() {
        decrease(GOURMET);
    }

    public void loadMoney(double amount) {
        if (amount < 0){
            return;
        }

        this.balance += amount;
        if (this.balance > 150) {
            this.balance = 150;
        }
    }

    @Override
    public String toString() {
        return "The card has " +this.balance + " euros";
    }


}