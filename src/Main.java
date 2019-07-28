//1st task
//Lesson 1
public class Main {
    public static void main(String[] args) {

        // 2st task
        byte byte1 = 11;
        short short2 = 2;
        int int3 = 3;
        long long4 = 4;
        float float5 = 25.9F ;
        double double6 = 128.25;
        boolean bool7 = true;
        char char8 = 'a';
        String str9 = "Hello";

        //3rd task
        int result = primer(10,12,20,30);
        System.out.println(result);

        //4th task
        System.out.println(exampleBool(2,19));

        //5th task
        examplePositive(55);

        //6th task
        boolean negative = exampleNegative(-5);
        System.out.println(negative);

        //7th task
        retName("Артем");

        //8th task
        year(1984);
    }

    //3rd task
    public static int primer(int a, int b, int c, int d ) {
        int res = a * (b + (c / d));
        return res;
    }
    //4th task
    public static boolean exampleBool (int a, int b) {
        int sum = a + b;
        if (sum <= 20 & sum >= 10) {
            return true;
        } else {
            return false;
        }
    }

    //5th task
    public static void examplePositive(int a){
        if (a >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    //6th task
    public static boolean exampleNegative(int b) {
        if (b >= 0) {
            return false;
        } else {
            return true;
        }
    }

    //7th task
    public static void retName(String str) {
        System.out.println("Привет, " + str + "!");
    }

    //8th task
    public static void year(int year){
        if (year % 4 == 0 && year % 100 !=0 || year % 400 == 0 ) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }

}
