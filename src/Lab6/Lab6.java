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
                default -> System.out.println("Такої дії не існує");
            }
        }
    }
}
