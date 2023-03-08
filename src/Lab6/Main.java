package Lab6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        Lab6 lab6 = new Lab6();
        boolean cycle = true;
        while (cycle) {
            System.out.println("""

                    Щоб завершити виконання введіть "0"
                    Введіть номер задачі:""");
            int start = i.nextInt();
            switch (start) {
                case 0 -> cycle = false;
                case 1 -> lab6.exercise1(i);
                case 2 -> System.out.println(lab6.exercise2(i));
                case 3 -> System.out.println(lab6.exercise3(i));
                case 4 -> System.out.println(lab6.exercise4(i));
                case 5 -> System.out.println(lab6.exercise5(i));
                case 6 -> System.out.println(lab6.exercise6(i));
                default -> System.out.println("Такої дії не існує");
            }
        }
    }
}