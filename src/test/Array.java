package test;

import java.util.ArrayList;

class Array {
    ArrayList<Human> humans = new ArrayList<>();
    Human Ars = new Human("Арсений", "Мясников");
    Human Vlad = new Human("Владислав", "Осипов");
    Human Nikita = new Human("Никита", "Юдин");

        void printArray() {
            humans.add(Ars);
            humans.add(Vlad);
            humans.add(Nikita);

            for (int i = 0; i < 3; i++) {
                System.out.println(humans.get(i).name);
            }
        }
}
