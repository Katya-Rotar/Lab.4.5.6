package Lab6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int exid = 1;
        boolean cycle = true;
        while (cycle) {
            System.out.println("""

                    Щоб завершити виконання введіть "0"
                    Введіть номер задачі:""");
            int start = i.nextInt();
            switch (start) {
                case 0 -> cycle = false;
                case 1 -> Lab6.exercise1(i);
                case 2 -> Lab6.exercise2(i);
                case 3 -> Lab6.exercise3(i,exid);
                case 4 -> Lab6.exercise4(i,exid);
                case 5 -> Lab6.exercise5(i,exid);
                case 6 -> Lab6.exercise6(i);
                default -> System.out.println("Такої дії не існує");
            }
        }
    }
}