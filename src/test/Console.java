package test;

public class Console {

       public void exe() {
            Check check = new Check();
            check.addProduct("Молоко", 50, 1);
            check.addProduct("Хлеб", 15, 3);
            check.addProduct("Сосиски", 80, 2);
            check.info();
        }
}
