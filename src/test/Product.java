package test;

public class Product {
    private String name;
    private int price;
    private int quantity;

    public Product(String productName, int productPrice, int productQuantity) {
        this.name = productName;
        this.price = productPrice;
        this.quantity = productQuantity;
    }

    public String getProductName() {
        return name;
    }

    public int getProductPrice() {
        return price;
    }

    public int getProductQuantity() {
        return quantity;
    }
}
