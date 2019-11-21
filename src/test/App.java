package test;

import java.util.Arrays;

public class App {
    int[] kek = new int[10];

    String[] productName = new String[10];
    int[] productQuantity = new int[10];
    int[] productPrice = new int[10];
    int count = 0;

    void start() {
        addProduct("Творог", 5, 60);
        addProduct("Хлеб", 2, 40);
        addProduct("Мясо", 1, 110);
        addProduct("Спички", 12, 100);
        printAllProducts();
    }

    void addProduct(String name, int quantity, int price) {
        productName[count] = name;
        productQuantity[count] = quantity;
        productPrice[count] = price;
        count++;
    }

    void printProduct(int index) {
        int width = 10;
        System.out.print(productName[index]);
        for (int i = 0; i < (width - productName[index].length()); i++) {
            System.out.print(" ");
        }
        System.out.println(productQuantity[index] + " " + productPrice[index]);
    }

    void printAllProducts() {
        for (int i = 0; i < count; i++) {
                printProduct(i);
        }
        System.out.print("Сумма: " + sumProducts());
    }

    int sumProducts() {
        int allPrice = 0;
        for (int i = 0; i < count; i++) {
            allPrice = allPrice + (productPrice[i] * productQuantity[i]);
        }
        return allPrice;
    }

    void sort() {
        for (int i = 0; i < kek.length; i++) {
            swap(i, arrayMin(i));
        }
    }

    void swap(int one, int two) {
        int temp = kek[one];
        kek[one] = kek[two];
        kek[two] = temp;
    }

    int arrayMin(int count) {
        int a = count;
        for (int i = count; i < kek.length; i++) {
            if (kek[i] < kek[a]) {
                a = i;
            }
        }
        return a;
    }

    void print() {
        for (int i = 0; i < kek.length; i++) {
            System.out.print(kek[i] + " ");
        }
        System.out.println();
    }

    void random() {
        for (int i = 0; i < kek.length; i++) {
            kek[i] = (int) (Math.random() * 10);
        }
    }

    void seven() {
        Arrays.fill(kek, 7);
    }

    void numbers() {
        for (int i = 0; i < kek.length; i++) {
            kek[i] = i;
        }
    }

    String[] arrayWords (String text) {
        String[] a = new String[quantityWords(text)];
        for (int i = 0; i < quantityWords(text); i++) {
            a[i] = findWord(text, i);
        }
        return a;
    }

    int quantityWords (String text) {
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ',') {
                counter++;
            }
        }
        return counter + 1;
    }

    String findWord(String text, int number) {
        int counter = 0;
        int one = 0;
        int two = 0;
        int a = 0;
        for (int i = 0; i <= text.length(); i++) {
            if (i == text.length() || text.charAt(i) == ',') {
                if (counter == (number - 1)) {
                    one = i;
                    counter++;
                    continue;
                }
                if (counter == number) {
                    two = i;
                    counter++;
                }
                counter++;
            }
        }
        if (one != 0) {
            a = 1;
        }
        return text.substring(one + a, two);
    }

    int findSecond(String text, char symbol) {
        int a = -1;
        for (int i = (text.length() - 1); i >= 0; i--) {
            if (text.charAt(i) == symbol) {
                return i;
            }
        }
        return a;
    }
    int findFirst(String text, char symbol) {
        int a = -1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == symbol) {
                return i;
            }
        }
        return a;
    }
}