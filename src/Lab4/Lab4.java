package Lab4;

import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        while (true) {
            System.out.println("""

                    Щоб завершити виконання введіть "0"
                    Введіть номер задачі:""");
            int start = i.nextInt();
            switch (start) {
                case 0 -> {
                }
                default -> System.out.println("Такої дії не існує");
            }
            if (start == 0) {
                break;
            }
        }
    }
}
