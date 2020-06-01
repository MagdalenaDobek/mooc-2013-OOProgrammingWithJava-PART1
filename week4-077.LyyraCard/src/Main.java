public class Main {
    public static void main(String[] args) {
        LyyraCard cardOfPekka = new LyyraCard(20);
        LyyraCard cardOfBrian = new LyyraCard(30);

        cardOfPekka.payGourmet();
        cardOfBrian.payEconomical();

        System.out.println("Pekka: " + cardOfPekka);
        System.out.println("Brian: " + cardOfBrian);

        cardOfPekka.loadMoney(20);
        cardOfBrian.payGourmet();

        System.out.println("Pekka: " + cardOfPekka);
        System.out.println("Brian: " + cardOfBrian);

        cardOfPekka.payEconomical();
        cardOfPekka.payEconomical();
        cardOfBrian.loadMoney(50);

        System.out.println("Pekka: " + cardOfPekka);
        System.out.println("Brian: " + cardOfBrian);

    }
}
