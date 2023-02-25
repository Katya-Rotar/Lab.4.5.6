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
                case 1 -> exercise1(i);
                case 2 -> exercise2(i);
                case 3 -> exercise3(i);
                case 4 -> exercise4(i);
                case 5 -> exercise5(i);
                case 6 -> exercise6(i);
                case 7 -> exercise7(i);
                default -> System.out.println("Такої дії не існує");
            }
        }
    }
    public static void exercise1(Scanner i) {
        System.out.println("Введіть значення n");
        int n = i.nextInt();
        double n1 = 0;
        for (int a = 1; a <= n; a++){
            int division = 1 / n;
            n1 += division;
        }
        System.out.println(n1);
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
        private static void exercise5(Scanner i){
        System.out.println("Введіть число");
        int n = i.nextInt();
        System.out.print(n + "^2 = ");
        for(int x = 1; x <= n; x++){
            int y = (2 * x) - 1;
            if (x == n){
                System.out.print(y + ";");
            }
            else {
                System.out.print(y + " + ");
            }
        }
    }
        private static void exercise6(Scanner i){
        System.out.println("Введіть значення а:");
        int a = i.nextInt();
        System.out.println("Введіть значення b:");
        int b = i.nextInt();
        int ab = 0;
        int ba = 0;
        for (int n = a; n <= b; n++){
            if(n % 3 == 0 && n % 5 != 0){
                ab++;
            }
            double sqrt = Math.sqrt(n);
            if(n % sqrt == 0){
                ba++;
            }
        }
        System.out.println("- "+ ab);
        System.out.println("- "+ ba);
    }
    private static void exercise7(Scanner i){
        System.out.println("Введіть значення i:");
        int i1 = i.nextInt();
        System.out.println("Введіть значення j:");
        int j = i.nextInt();
        System.out.println("Введіть значення n:");
        int n = i.nextInt();
        int i1j = 0;
        for (int N = 1; N <= n; N++){
            int sum = 1 + i1 + j;
            i1j += sum;
        }
        System.out.println("\n" + i1j);
    }
}
