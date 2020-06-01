public class Product {
    private String productName;
    private double price;
    private int amount;

    public Product(String nameAtStart, double priceAtStart, int amountAtStart) {
        this.price = priceAtStart;
        this.amount = amountAtStart;
        this.productName = nameAtStart;
    }

    public void printProduct() {
        System.out.println(this.productName + ", price " + this.price + ", amount " + this.amount);
    }
}
