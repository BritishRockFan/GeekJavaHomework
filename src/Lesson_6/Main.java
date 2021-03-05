package Lesson_6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        cat1.info();
        cat2.info();

        System.out.println();

        dog1.info();
        dog2.info();

        System.out.println();

        dog1.run(451);
        dog1.swim(9);
        dog1.jump(0.2);

        System.out.println();

        cat1.run(1600);
        cat1.swim(5);
        cat1.jump(1.6);
    }
}

