public class Main {
    public static void main(String[] args) {
        System.out.println("Привет, наставник!:)");

        System.out.println("Задание 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Задание 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("Задание 3");
        for (int i = 2; i <= 17; i += 2) {
            System.out.println(i);
        }

        System.out.println("Задание 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println("Задание 5");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }

        System.out.println("Задание 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }

        System.out.println("Задание 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }

        System.out.println("Задание 8");
        int total = 29000;
        for (int i = 1; i <= 12; i++) {
            System.out.println("Месяц " + i + ", сумма накоплений равна " + (total * i) + " рублей");
        }

        System.out.println("Задание 9");
        int startSumma = 29000;
        int start = 0;
        for (int i = 1; i <= 12; i++) {
            start += start / 100;
            start += startSumma + start * 0.01;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + start + " рублей");
        }

        System.out.println("Задание 10");
        for (int l = 1; l <= 10; l++) {
            int two = 2 * l;
            System.out.println("2 * " + l + " = " + two);
        }
    }
}