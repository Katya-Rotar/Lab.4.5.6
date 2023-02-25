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
}
