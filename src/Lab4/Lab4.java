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
                case 4 -> exercise4(i);
                case 5 -> exercise5(i);
                case 6 -> exercise6(i);
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
        if( ab > ac){
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
        if (V2 >= V1 && x < a && y < b && z < c){
            System.out.println("Ця коробка поміститься");
        }
        else
            System.out.println("Ця коробка НЕ поміститься");
    }
    private static void exercise4(Scanner i){
        System.out.println("Тестування");
        int points = 0;
        System.out.println("У якому році було проголошено незалежність України ?");
        int question1 = i.nextInt();
        if(question1 == 1991){
            points++;
        }
        System.out.println("У якому році було ухвалено Конституцію України ?");
        int question2 = i.nextInt();
        if(question2 == 1996){
            points++;
        }
        System.out.println("У якому році було обрано першого призидента України ?");
        int question3 = i.nextInt();
        if(question3 == 1994){
            points++;
        }
        System.out.println("У якому році було запроваджено національну грошову одиницю - гривня ?");
        int question4 = i.nextInt();
        if(question4 == 1996){
            points++;
        }
        System.out.println("У якому році було започатковано Збройні Сили України ?");
        int question5 = i.nextInt();
        if(question5 == 1991){
            points++;
        }
        int point = (points * 100) / 5;
        System.out.println( points + " / 5\n" + "Це " + point +"%");
    }
    private static void exercise5(Scanner i){
        System.out.println("Введіть порядковий номер дня");
        int day = i.nextInt();
        switch (day){
            case 1 -> System.out.println("""
                        Понеділок
                        1. Вища математика
                        2. Алгоритиізація та програмування
                        3. Алгоритиізація та програмування
                        """);
            case 2 -> System.out.println("""
                    Вівторок
                    1. Структури даних та алгоритмів
                    2. Комп'ютерна графіка
                    3. -
                    4. -
                    5. Фізичне виховання
                    """);
            case 3 -> System.out.println("""
                        Середа
                        1. -
                        2. Вища метематика
                        3. Алгоритиізація та програмування
                        """);
            case 4 -> System.out.println("""
                        Четвер
                        1. Фізика
                        2. Фізика
                        3. Фізика
                        """);
            case 5 -> System.out.println("""
                        П'ятниця
                        1. Вища математика
                        2. Структури даних та алгоритмів
                        3. Іноземна мова
                        """);
            default -> System.out.println("Такого дня не існує");
        }
    }
    private static void exercise6(Scanner i){
        System.out.print("""
                Арифметичні дії:
                1 – додавання
                2 – віднімання
                3 - множення
                4 – ділення
                Введіть номер арифметичної дії
                """);
        int number = i.nextInt();
        System.out.println("Введіть два дійсні числа");
        int A = i.nextInt();
        int B = i.nextInt();
        switch (number){
            case 1 -> {
                int action1 = A + B;
                System.out.println(action1);
            }
            case 2 -> {
                int action2 = A - B;
                System.out.println(action2);
            }
            case 3 -> {
                int action3 = A * B;
                System.out.println(action3);
            }
            case 4 -> {
                if (B == 0){
                    System.out.println("На 0 ділити не можна");
                }
                else {
                    int action4 = A / B;
                    System.out.println(action4);
                }
            }
            default -> System.out.println("Такої дії не існує");
        }
    }
}