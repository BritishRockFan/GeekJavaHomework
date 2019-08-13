package Lesson_4;

import java.util.Random;
import java.util.Scanner;

public class CrossAndZeros {
    private static Scanner scanner = new Scanner(System.in);
    private static final Random rand = new Random();

    private static final int FIELD_SIZE = 5;

    private static char[][] field = new char[FIELD_SIZE][FIELD_SIZE];

    private static final char PLAYER_DOT = 'X';
    private static final char AI_DOT = 'O';
    private static final char EMPTY_DOT = '.';
    private static final int WIN_LINE = 4;

    private static void buildField() {
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                field[i][j] = EMPTY_DOT;
            }
        }
    }

    private static void printField() {
        System.out.println("-----------");
        for (int i = 0; i < FIELD_SIZE; i++) {
            System.out.print("|");
            for (int j = 0; j < FIELD_SIZE; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("-----------");
    }

    private static void setSym(int y, int x, char sym) {
        field[y][x] = sym;
    }

    private static boolean isFieldFull() {
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                if (field[i][j] == EMPTY_DOT) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isCellValid(int y, int x) {
        if (x < 0 || y < 0 || x > FIELD_SIZE - 1 || y > FIELD_SIZE - 1) {
            return false;
        }
        return (field[y][x] == EMPTY_DOT);
    }

    private static void playerStep() {
        int x,y;
        do {
            System.out.println("Введите координаты: X Y (1-5)");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(y,x));

        setSym(y, x, PLAYER_DOT);
    }

    private static void aiStep() {
        for (int i = 0; i < FIELD_SIZE; i++)
            for (int j = 0; j < FIELD_SIZE; j++) {
                if (isCellValid(i, j)) {
                    setSym(i, j, AI_DOT);
                    if (checkWin(AI_DOT)) return;
                    setSym(i, j, EMPTY_DOT);
                }
            }
        for (int i = 0; i < FIELD_SIZE; i++)
            for (int j = 0; j < FIELD_SIZE; j++) {
                if (isCellValid(i, j)) {
                    setSym(i, j, PLAYER_DOT);
                    if (checkWin(PLAYER_DOT)) {
                        setSym(i, j, AI_DOT);
                        return;
                    }
                    setSym(i, j, EMPTY_DOT);
                }
            }
        int x;
        int y;
        do {
            x = rand.nextInt(FIELD_SIZE);
            y = rand.nextInt(FIELD_SIZE);
        } while (!isCellValid(y, x));
        setSym(y, x, AI_DOT);
    }

    private static boolean checkWin(char sym) {
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                if (checkWinLine(i, j, 0, 1,  sym)) return true;
                if (checkWinLine(i, j, 1, 1,  sym)) return true;
                if (checkWinLine(i, j, 1, 0,  sym)) return true;
                if (checkWinLine(i, j, -1, 1, sym)) return true;
            }
        }
        return false;
    }

    private static boolean checkWinLine(int y, int x, int vy, int vx, char sym) {
        int wayX = x + (WIN_LINE - 1) * vx;
        int wayY = y + (WIN_LINE - 1) * vy;
        if (wayX < 0 || wayY < 0 || wayX > FIELD_SIZE - 1 || wayY > FIELD_SIZE - 1) return false;
        for (int i = 0; i < WIN_LINE; i++) {
            int itemY = y + i * vy;
            int itemX = x + i * vx;
            if (field[itemY][itemX] != sym) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        buildField();
        printField();

        while (true) {
            playerStep();
            printField();
            if (checkWin(PLAYER_DOT)) {
                System.out.println("PLAYER WIN!");
                break;
            }
            if (isFieldFull()) {
                System.out.println("DRAW!");
                break;
            }
            aiStep();
            printField();
            if (checkWin(AI_DOT)) {
                System.out.println("SkyNet WIN!");
                break;
            }
            if (isFieldFull()) {
                System.out.println("DRAW!");
                break;
            }
        }
    }
}

