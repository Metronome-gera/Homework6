//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Задача №1
        for (int i = 1; i <= 10; i++ ){
            System.out.println(i);
}
        // Задача №2
        for (int i = 10; i >= 1; i-- ){
            System.out.println(i);
        }
        // Задача №3
        for (int i = 0; i <= 17;i = i + 2){
            System.out.println(i);
        }
        // Задача №4
        for (int i = 10; i >= -10; i  = i - 1){
            System.out.println(i);
        }
        // Задача №5
        for (int i = 1904; i <= 2096; i= i + 4 ){
            System.out.println(i + "год является високосным");
        }
        // Задача №6
        for (int i = 0; i <= 100; i=i+7 ){
            System.out.println(i);
        }
        // Задача №7
        for (int i = 1; i <= 512; i= i * 2 ){
            System.out.println(i);
        }
        // Задача №8
        int mony = 29000;
        int total = 0;
        for (int i = 0; total<2459000; i++ ){
            total = total + mony;
            System.out.printf("Месяц " +i+ " сумма накопленийравна " +total+ " рублей");
        }
        // Задача №9
        int salary = 29000;
        int full = 0;
        for (int i = 0; i <=12; i++ ){
            full = full + full/100;
            full = full + salary;
            System.out.printf(" Месяц " +i+ " сумма накопленийравна " +full+ " рублей");

        }
        // Задача №10
        int number =2;
        int factor = 2;
        for (int i = 1; i <= 9; i++ ){
            factor = number*i;
            System.out.printf(number+" * " + i+" = "+ factor+"; ");

        }

// Часть 2
        System.out.println(" ");
        System.out.println(" Часть 2");
        System.out.println(" ");
        System.out.println(" Задача №1");
        //Задание №1
        //  Взято из задачи №8
        int mony2 = 15000;
        int total2 = 0;
        int i = 0;
        while (total2<2459000) {
            total2 = total2 + mony2;
            i = i + 1;
            if (total2 >= 2459000) {
                System.out.println(" Месяц " + i + " сумма накоплений равна " + total2);
            }
        }
        System.out.println(" Задача №2");
        //Задание №2
        int number2 = 0;
        while (number2<=9){
            number2 = number2 + 1;
            System.out.printf(" " + number2);
        }
        System.out.println("");

        for (int g = 10; g >= 1; g-- ){
            System.out.printf(g+" ");
        }
        System.out.println(" ");
        System.out.println(" Задача №3 ");

        //Задача №3
        int population = 12_000_000;
        int increase = 17;
        int death = 8;
        int population2 = (population/1000)*(increase-death);
        for (int year =0; year<=10; year++){
           population = population + population2;
            System.out.println("Год "+ year + " численность населения состовляет "+ population);
        }

        System.out.println(" ");
        System.out.println(" Задача №4");
        //Задача №4

        int capital = 15000;
        int month = 0;
        while (capital <= 12_000_000){
            capital = capital + ((capital/100)*7);
            month = month + 1;
            System.out.println("Месяц "+ month+" сумма нкаоплений "+ capital);
        }
        System.out.println(" ");
        System.out.println(" Задача №5");

        //Задача №5
        int capital2 = 15000;
        int month2 = 0;
        while (capital2 <= 12_000_000) {
            capital2 = capital2 + ((capital2 / 100) * 7);
            month2 = month2 + 1;
            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 + " сумма нкаоплений " + capital2);
            }
        }
        System.out.println(" ");
        System.out.println(" Задача №6");
        //Заача №6

        int capital3 = 15000;
        int month3 = 0;
        while (month3 <= (12*9)) {
            capital3 = capital3 + ((capital3 / 100) * 7);
            month3 = month3 + 1;
            if (month3 % 6 == 0) {
                System.out.println("Месяц " + month3 + " сумма нкаоплений " + capital3);
            }
        }
        System.out.println(" ");
        System.out.println(" Задача №7");
        //Задача №7

        int day = 3;
        int takt = 0;
        System.out.println("Сегодня пятница " + day + " число. Необходимо подготовить отчет");
        while ( day <=31) {
            day = day + 1;
            takt = takt + 1;
            if (takt % 7 == 0) {
                System.out.println("Сегодня пятница " + day + " число. Необходимо подготовить отчет");
            }
        }
        System.out.println(" ");
        System.out.println(" Задача №8");
        //Задание №8


        }
}