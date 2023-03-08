package Lab6;

import java.util.Scanner;

public class Lab6 {
    protected static void exercise1(Scanner i){
        System.out.println("Введіть поточний курс");
        int currency = i.nextInt();
        int x = 1;
        while (x <= 10){
            System.out.println( x + " $ - " + (x * currency) + " ₴");
            x++;
        }
    }
    protected static void exercise2(Scanner i){
        System.out.println("Введіть число а");
        int a = i.nextInt();
        int max = 0, n = 1;
        while ( n < 5000){
            if( n % a == 0){
                max = n;
            }
            n++;
        }
        System.out.println(max);
    }
    protected static void exercise3(Scanner i, int exid){
        System.out.println("""
                Введіть n цілих чисел
                Щоб завершити введіть 0""");
        int sum = 0;
        while (exid != 0){
            int n = i.nextInt();
            sum += n;
            if (n == 0){
                exid--;
            }
        }
        System.out.println(sum);
    }
    protected static void exercise4(Scanner i, int exid){
        System.out.println("""
                Введіть n цілих чисел
                Щоб завершити введіть 0""");
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        while (exid != 0){
            int n = i.nextInt();
            if (n == 0){
                exid--;
            }
            else {
                if (n <= min) {
                    min = n;
                }
                if (n >= max) {
                    max = n;
                }
            }
        }
        System.out.println(max - min);
    }
    protected static void exercise5(Scanner i, int exid){
        System.out.println("Введіть максимальне можливе значення");
        int n = i.nextInt();
        System.out.println("Введіть послідовність цілих чисел");
        int sum = 0, N = 0;
        while (exid != n) {
            int n1 = i.nextInt();
            if (n1 >= 0) {
                if (n1 >= n) {
                    exid = n;
                } else {
                    sum += n1;
                    N++;
                }
            }
        }
        double x = (double) sum / N;
        System.out.println(x);
    }
    protected static void exercise6(Scanner i){
        System.out.println("Введіть кількість студентів");
        int n = i.nextInt();
        int N = 1, sum = 0, N2 = 0;
        System.out.println("Введіть бали");
        while (N <= n){
            int student = i.nextInt();
            sum += student;
            if(student == 5){
                N2++;
            }
            N++;
        }
        double student2 = (double) sum / n;
        System.out.println("Середній бал: " + student2);
        System.out.println("Кількість п'ятірок: "+ N2);
    }
}