package Lesson_3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        fancyNumberChoosing();
    }

    public static void fancyNumberChoosing() {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int a, n = random.nextInt(10);
        System.out.println("Задано число от 0 до 9. У вас есть 3 попытки. Введите число.");
        for (int i = 0; i < 3; i++) {
            System.out.println("Попытка " + (i + 1) + ": ");
            a = in.nextInt();
            if (a < n) System.out.println("Загаданное число больше!");
            if (a > n) System.out.println("Загаданное число меньше!");
            if (a == n) {
                System.out.println("Вы угадали!");
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
                a = in.nextInt();
                if (a == 1) fancyNumberChoosing();
                else {
                    System.out.println("Выход.");
                    System.exit(0);
                }
            }
        }
        System.out.println("Вы не угадали.");
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        a = in.nextInt();
        if (a == 1) fancyNumberChoosing();
        else {
            System.out.println("Выход.");
        }
    }
}
