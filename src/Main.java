//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Задача №1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        // Задача №2
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        // Задача №3
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
        // Задача №4
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(i);
        }
        // Задача №5
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + "год является високосным");
        }
        // Задача №6
        for (int i = 0; i <= 100; i = i + 7) {
            System.out.println(i);
        }
        // Задача №7
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        // Задача №8
        int mony = 29000;
        int total = 0;
        for (int i = 0; total < 2459000; i++) {
            total = total + mony;
            System.out.printf("Месяц " + i + " сумма накопленийравна " + total + " рублей");
        }
        // Задача №9
        int salary = 29000;
        int full = 0;
        for (int i = 0; i <= 12; i++) {
            full = full + full / 100;
            full = full + salary;
            System.out.printf(" Месяц " + i + " сумма накопленийравна " + full + " рублей");

        }
        // Задача №10
        int number = 2;
        int factor = 2;
        for (int i = 1; i <= 9; i++) {
            factor = number * i;
            System.out.printf(number + " * " + i + " = " + factor + "; ");

        }

// Часть 2
        System.out.println("\n\nЧасть 2\n\nЗадача №1");

        //Задание №1
        //  Взято из задачи №8
        double monyMonth = 15000;
        double total2 = 0;
        double monthGrowth = 0;
        int in = 0;
        double percent = 0.12;
        while (total2 <= 2459000) {
            monthGrowth = (total2 + percent) / 12;
            total2 = total2 + monyMonth + monthGrowth;
            in += 1;

            System.out.printf(" Месяц " + in + " сумма накоплений равна " + "%.2f", total2);
            System.out.println(" ");
        }

        System.out.println("\n\nЗадача №2");
        //Задание №2
        int number2 = 0;
        while (number2 <= 9) {
            number2 = number2 + 1;
            System.out.printf(" " + number2);
        }
        System.out.println("");

        for (int g = 10; g >= 1; g--) {
            System.out.printf(g + " ");
        }
        System.out.println("\n\nЗадача №3 ");

        //Задача №3
        int population = 12_000_000;
        int birthRate = 17;
        int mortalityRate = 8;
        int population2 = (population / 1000) * (birthRate - mortalityRate);
        for (int year = 1; year <= 10; year++) {
            int births = birthRate * population / 1000;
            int deaths = mortalityRate * population / 1000;
            population = population + (births - deaths);
            System.out.println("Год " + year + " численность населения состовляет " + population);
        }

        System.out.println("\n\nЗадача №4 ");

        //Задача №4

        int month = 0;
        double corretAmount = 15000;
        double targetAmount = 12_000_000;
        while (corretAmount <= targetAmount) {
            corretAmount = corretAmount + corretAmount / 100 * 7;
            month = month + 1;
                System.out.printf("Месяц " + month + " сумма накоплений " + "%.2f", corretAmount);
                System.out.println(" ");
        }

        System.out.println("\n\nЗадача №5 ");

        //Задача №5
        int month2 = 0;
        double corretAmount2 = 15000;
        double targetAmount2 = 12_000_000;
        while (corretAmount2 <= targetAmount2) {
            corretAmount2 = corretAmount2 + corretAmount2 / 100 * 7;
            month2 = month2 + 1;
            if (month2 % 6 == 0) {
                System.out.printf("Месяц " + month2 + " сумма накоплений " + "%.2f", corretAmount2);
                System.out.println(" ");
            }
        }
        System.out.println("\n\nЗадача №6 ");
        //Заача №6

        double capital3 = 15000;
        int month3 = 0;
        while (month3 <= (12 * 9)) {
            capital3 = capital3 + capital3 / 100 * 7;
            month3 = month3 + 1;
            if (month3 % 6 == 0) {
                System.out.printf("Месяц " + month3 + " сумма накоплений " + "%.2f", capital3);
                System.out.println(" ");
            }
        }
        System.out.println("\n\nЗадача №7 ");
        //Задача №7

        int day = 3;
        int takt = 0;
        System.out.println("Сегодня пятница " + day + " число. Необходимо подготовить отчет");
        while (day <= 31) {
            day = day + 1;
            takt = takt + 1;
            if (takt % 7 == 0) {
                System.out.println("Сегодня пятница " + day + " число. Необходимо подготовить отчет");
            }
        }
        System.out.println("\n\nЗадача №8 ");
        //Задание №8

        int bull = 79;
        int carrentYear = 2025;
        int startYear = carrentYear - 200;
        int endYear = carrentYear + 100;
        int y = 0;
        for (; y <= endYear; y = y + bull) {
            while (y >= startYear && y <= endYear) {
                System.out.println(y);
                break;
            }
        }

    }
}













//аааааааааааааааааааааааааааааааааааааааааааааааа