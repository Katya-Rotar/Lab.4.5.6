package Lab6;

import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        boolean cycle = true;
        while (cycle) {
            System.out.println("""

                    Щоб завершити виконання введіть "0"
                    Введіть номер задачі:""");
            int start = i.nextInt();
            switch (start) {
                case 0 -> cycle = false;
                case 1 -> exercise1(i);
                case 2 -> exercise2(i);
                case 3 -> exercise3(i);
                case 4 -> exercise4(i);
                case 5 -> exercise5(i);
                case 6 -> exercise6(i);
                default -> System.out.println("Такої дії не існує");
            }
        }
    }
    private static void exercise1(Scanner i){
        System.out.println("Введіть поточний курс");
        int currency = i.nextInt();
        int x = 1;
        while (x <= 10){
            int currency1 = x * currency;
            System.out.println( x + " $ - " + currency1 + " ₴");
            x++;
        }
    }
    private static void exercise2(Scanner i){
        System.out.println("Введіть число а");
        int a = i.nextInt();
        int max = 0;
        int n = 1;
        while ( n < 5000){
            if( n % a == 0){
                max = n;
            }
            n++;
        }
        System.out.println(max);
    }
    private static void exercise3(Scanner i){
        System.out.println("""
                Введіть n цілих чисел
                Щоб завершити введіть 0
                """);
        int exid = 1;
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
    private static void exercise4(Scanner i){
        System.out.println("""
                Введіть n цілих чисел
                Щоб завершити введіть 0
                """);
        int exid = 1;
        int min = 100000;
        int max = 0;
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
        int m_n = max - min;
        System.out.println(m_n);
    }
    private static void exercise5(Scanner i){
        System.out.println("Введіть максимальне можливе значення");
        int n = i.nextInt();
        System.out.println("Введіть послідовність цілих чисел");
        int exid = 0;
        int sum = 0;
        int N = 0;
        while (exid != n) {
            int n1 = i.nextInt();
            if (n1 >= 0) {
                if (n1 == n) {
                    exid = n;
                } else {
                    sum += n1;
                    N++;
                }
            }
        }
        int number = sum / N;
        System.out.println(number);
    }
    private static void exercise6(Scanner i){
        System.out.println("Введіть кількість студентів");
        int n = i.nextInt();
        int N = 1;
        int sum = 0 ;
        int N2 = 0;
        System.out.println("Введіть бали ");
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
        System.out.println("Кількість п'ятірок: "+N2);
    }
}
