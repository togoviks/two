package test;

import java.util.ArrayList;

public class Check {
    private ArrayList<Product> productList = new ArrayList<>();
    String name;

    public Check(String name) {
        this.name = name;
    }

    public void addProduct(String productName, int productPrice) {
        Product productObject = new Product(productName, productPrice);
        productList.add(productObject);
    }

    public void info() {
        for (int i = 0; i < productList.size(); i++) {
            System.out.print(productList.get(i).name);
            for (int j = 0; j < (getLongWord() + 3) - productList.get(i).name.length(); j++) {
                System.out.print(" ");
            }
            System.out.println(productList.get(i).price);
        }
        System.out.println("Общая стоимость: " + fullPrice());
    }

    private int getLongWord() {
        int number = 0;
        for (int i = 0; i < productList.size(); i++) {
            if (number < productList.get(i).name.length()) {
                number = productList.get(i).name.length();
            }
        }
        return number;
    }

    private int fullPrice() {
        int price = 0;
        for (int i = 0; i < productList.size(); i++) {
            price = price + productList.get(i).price;
        }
        return price;
    }
}
