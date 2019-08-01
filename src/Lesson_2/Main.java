package Lesson_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Task 1
        int mass[] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == 1) {
                mass[i] = 0;
            } else {
                mass[i] = 1;
            }
        }
        System.out.println(Arrays.toString(mass));

        //Task 2
        System.out.println();
        int mass2ndTask[] = new int[8];
        int b = 0;
        for (int a = 0; a < mass2ndTask.length; a++, b = b+3) {
            mass2ndTask[a] = b;
        }
        System.out.println(Arrays.toString(mass2ndTask));

        //Task 3
        System.out.println();
        int mass3rdTask[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int c = 0; c < mass3rdTask.length; c++) {
            if (mass3rdTask[c] < 6) {
                mass3rdTask[c] = mass3rdTask[c] * 2;
            }
        }
        System.out.println(Arrays.toString(mass3rdTask));

        //Task 4
        System.out.println();
        int mass4thTask[][] = new int[9][9];
        for (int d = 0; d < mass4thTask.length; d++) {
            for (int x = 0, x2 = mass4thTask[d].length; x < mass4thTask.length; x++, x2--){
                if (d == x || d == (x2 - 1)) {
                    mass4thTask[d][x] = 1;
                }
                System.out.print(mass4thTask[d][x] + " ");
            }
            System.out.println();
        }

        //Task 5
        System.out.println();
        int minMaxMass[] = {8, 16, 32, 49, 3, 6, 2, 7, 21, 56, 78, 18};
        int arrMax = minMaxMass[0];
        int arrMin = minMaxMass[0];
        for (int z = 0; z < minMaxMass.length; z++) {
            if (arrMax < minMaxMass[z]){
                arrMax = minMaxMass[z];
            }
            if (minMaxMass[z] < arrMin) {
                arrMin = minMaxMass[z];
            }
        }
        System.out.println(Arrays.toString(minMaxMass));
        System.out.println("Максимальное: " + arrMax);
        System.out.println("Минимальное: " + arrMin);

        //Task 6
        System.out.println();
        int mass6thTask [] = {3, 8, 6, 9, 12, 88, 45, 23, 11, 7, 2, 19};
        System.out.println(checkBalance(mass6thTask));



        //Task 7
        System.out.println();
        int mass7thTask [] = {8, 6, 9, 28, 13, 22, 12, 45, 89, 4, 34, 17};
        changeMassive(mass7thTask, -2);

        //Task 8
        System.out.println();
        int bobbleSortTask [] = {6,5,1,3,9};
        bobbleSort(bobbleSortTask);


    }

    //Task 6
    private static boolean checkBalance(int[] balanceMass) {
        for (int r = 0; r < balanceMass.length + 1; r++) {
            int leftSide = 0;
            int rightSide = 0;
            for (int j = 0; j < r; j++) {
                leftSide += balanceMass[j];
            }
            for (int j = r; j < balanceMass.length; j++) {
                rightSide += balanceMass[j];
            }
            if (leftSide == rightSide) {
                return true;
            }
        }
        return false;
    }

    //Task 7
    private static void changeMassive(int[] changeM, int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int shift = changeM[changeM.length - 1];
                for (int m = changeM.length - 1; m > 0; m--) {
                    changeM[m] = changeM[m - 1];
                }
                changeM[0] = shift;
            }
        } else if (n < 0 ) {
            for (int i = 0; i < n * (-1); i++) {
                int shift = changeM[0];
                for (int m = 0; m < changeM.length - 1; m++) {
                    changeM[m] = changeM[m + 1];
                }
                changeM[changeM.length - 1] = shift;
            }
        }
        System.out.println(Arrays.toString(changeM));
    }

    //Task 8 bobblesort
    public static void bobbleSort(int[] bobble) {
        for (int i = bobble.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (bobble[j] > bobble[j + 1]) {
                    int a = bobble[j];
                    bobble[j] = bobble[j + 1];
                    bobble[j + 1] = a;
                }
            }
        }
            System.out.println(Arrays.toString(bobble));
    }
}


