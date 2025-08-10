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
        for (int i = 0; i <=12; i++ ){
            total = total + mony;
            System.out.printf("Месяц " +i+ " сумма накопленийравна " +total+ " рублей");
        }
        // Задача №9
        int salary = 29000;
        int full = 0;
        for (int i = 0; i <=12; i++ ){
            full = full + full/100;
            full = full + salary;
            System.out.printf("Месяц " +i+ " сумма накопленийравна " +full+ " рублей");
        }
        // Задача №10
        int number =2;
        int factor = 2;
        for (int i = 1; i <= 9; i++ ){
            factor = number*i;
            System.out.printf(number+" * " + i+" = "+ factor+"; ");

        }
    }
}