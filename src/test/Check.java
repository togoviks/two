package test;

import java.util.ArrayList;

public class Check {
    private ArrayList<Product> productList = new ArrayList<>();

    public void addProduct(String productName, int productPrice, int productQuantity) {
        productList.add(new Product(productName, productPrice, productQuantity));
    }

    public void info() {
        for (int i = 0; i < productList.size(); i++) {
            System.out.print(productList.get(i).getProductName());
            setSpace(i);
            System.out.println(productList.get(i).getProductQuantity() + " шт. по " + productList.get(i).getProductPrice() + " руб.");
        }
        System.out.println("Общая стоимость: " + fullPrice());
    }

    private void setSpace(int i) {
        for (int j = 0; j < (getLongWord() + 1) - productList.get(i).getProductName().length(); j++) {
            System.out.print(" ");
        }
    }

    private int getLongWord() {
        int number = 0;
        for (int i = 0; i < productList.size(); i++) {
            if (number < productList.get(i).getProductName().length()) {
                number = productList.get(i).getProductName().length();
            }
        }
        return number;
    }

    private int fullPrice() {
        int price = 0;
        for (int i = 0; i < productList.size(); i++) {
            price = price + (productList.get(i).getProductPrice() * productList.get(i).getProductQuantity());
        }
        return price;
    }
}
