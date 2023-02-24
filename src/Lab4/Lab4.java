package Lab4;

import java.util.Scanner;

public class Lab4 {
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
        System.out.println("Введіть координати точки А:");
        int x1 = i.nextInt();
        int y1 = i.nextInt();
        System.out.println("Введіть координати точки B:");
        int x2 = i.nextInt();
        int y2 = i.nextInt();
        System.out.println("Введіть координати точки C:");
        int x3 = i.nextInt();
        int y3 = i.nextInt();
        double ab = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        double ac = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
        if( ab < ac){
            System.out.println("Точка C\n"+ "x = "+ x3 + "\n"+"y = " + y3 +"\n"+"Відстань до А = " + ac);
        }
        else {
            System.out.println("Точка B\n"+ "x = "+ x2 + "\n"+"y = " + y2 +"\n"+"Відстань до А = " + ab);
        }
    }
    private static void exercise2(Scanner i){
        System.out.println("Введіть суму покупок");
        int shopping = i.nextInt();
        if (shopping >= 500 && shopping <= 1000){
            double discount1 = (double) (5 * shopping) / 100;
            System.out.println("Сума до оплати: " + (shopping - discount1));
        } else if (shopping >= 1001 && shopping <= 10000) {
            double discount2 = (double) (7 * shopping) / 100;
            System.out.println("Сума до оплати: " + (shopping - discount2));
        }else if (shopping > 10000) {
            double discount2 =(double) (9 * shopping) / 100;
            System.out.println("Сума до оплати: " + (shopping - discount2));
        }
        else {
            System.out.println("Сума до оплати: " + shopping);
        }
    }
    private static void exercise3(Scanner i){
        System.out.println("Введіть розмір коробки:");
        int x = i.nextInt();
        int y = i.nextInt();
        int z = i.nextInt();
        System.out.println("Введіть розмір ящика:");
        int a = i.nextInt();
        int b = i.nextInt();
        int c = i.nextInt();
        int V1 = x * y * z;
        int V2 = a * b * c;
        if (V2 >= V1){
            System.out.println("Ця коробка поміститься");
        }
        else
            System.out.println("Ця коробка НЕ поміститься");
    }
}