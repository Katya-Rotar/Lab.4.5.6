package Lab5;

import java.util.Scanner;

public class Lab5 {
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
                case 2 -> exercise2(i);
                case 3 -> exercise3(i);
                case 4 -> exercise4(i);
                default -> System.out.println("Такої дії не існує");
            }
        }
    }
    private static void exercise2(Scanner i){
        System.out.println("Введіть значення n");
        int n = i.nextInt();
        if(n > 1 && n < 10) {
            for (int a = 1; a <= 9; a++) {
                int b = a * n;
                System.out.println(a + " x " + n + " = " + b);
            }
        }
        else
            System.out.println("n не відповідає діапазону");
    }
    private static void exercise3(Scanner i){
        System.out.println("Введіть значення а:");
        int a = i.nextInt();
        System.out.println("Введіть значення b:");
        int b = i.nextInt();
        System.out.println("Введіть значення h:");
        int h = i.nextInt();
        int a2 = 0;
        int a3 = 0;
        for (int a1 = a; a1 <= b; ){
            System.out.println(a1);
            a2 += a1;
            a3++;
            a1 = a1 + h;
            }
        int average = a2 / a3;
        System.out.println("\n"+ average);
        }
    private static void exercise4(Scanner i){
        System.out.println("Введіть натуральні числа");
        int x = i.nextInt();
        int y = i.nextInt();
        int xy = 0;
        for(int a = 1; a <= y; a++){
            xy += x;
        }
        System.out.println(xy);
        }
    }
