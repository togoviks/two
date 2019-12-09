package test;

public class Console {

        void exe() {
            Check check = new Check("one");
            check.addProduct("Молоко", 50);
            check.addProduct("Хлеб", 15);
            check.addProduct("Сосиски", 80);
            check.info();
        }
}
