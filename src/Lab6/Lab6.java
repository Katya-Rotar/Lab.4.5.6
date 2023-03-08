package Lab6;

import java.util.Scanner;

public class Lab6 {
    void exercise1(Scanner i){
        System.out.println("Введіть поточний курс");
        double currency = i.nextDouble();
        int x = 1;
        while (x <= 10){
            double x1 = (double) x * currency;
            System.out.println( x + " $ - " + x1 + " ₴");
            x++;
        }
    }
    int exercise2(Scanner i){
        System.out.println("Введіть число а");
        int a = i.nextInt();
        int max = 0, n = 1;
        while ( n < 5000){
            if( n % a == 0){
                max = n;
            }
            n++;
        }
        return max;
    }
    int exercise3(Scanner i){
        System.out.println("""
                Введіть n цілих чисел
                Щоб завершити введіть 0""");
        int sum = 0;
        while (true){
            int n = i.nextInt();
            sum += n;
            if (n == 0){
                break;
            }
        }
        return sum;
    }
    int exercise4(Scanner i){
        System.out.println("""
                Введіть n цілих чисел
                Щоб завершити введіть 0""");
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        while (true){
            int n = i.nextInt();
            if (n == 0){
                break;
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
        return max - min;
    }
    double exercise5(Scanner i){
        System.out.println("Введіть максимальне можливе значення");
        int n = i.nextInt();
        System.out.println("Введіть послідовність цілих чисел");
        int sum = 0, N = 0;
        while (true) {
            int n1 = i.nextInt();
            if (n1 >= 0) {
                if (n1 >= n) {
                    break;
                } else {
                    sum += n1;
                    N++;
                }
            }
        }
        return (double) sum / N;
    }
    String exercise6(Scanner i){
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
        return "Середній бал: " + student2 + "\nКількість п'ятірок: "+ N2;
    }
}