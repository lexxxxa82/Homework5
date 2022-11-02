import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1"); // задача № 1
        for (int i = 0; i < 10; i++) {
            System.out.println("итеракция цыкла " + i);
        }
        System.out.println("Задача 2");// задача № 2
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("задача 3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
        System.out.println("задача 4");
        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        }
        System.out.println(" задача 4");
        for (int i = 1904; i < 2096  ; i = i + 4)
        {
            System.out.println( "год является високосным "+i);
        }
        System.out.println( "задача 5");
        for (int i = 0; i < 99; i = i + 7) {
            System.out.println(i);
        }
            System.out.println( "задача 6");
            for ( int i = 1; i <= 512 ;i= i*2){
                System.out.println( i);
            }
        System.out.println( "задача 7");
            int salary =100;
            int total =0;
            for ( int i =0; i<=12 ; i++){
                total = total + total / 100;
                total = total + salary;
            System.out.println( "месяц " + i + " итого " + total);
        }
        System.out.println(total);

        System.out.println( "задача 8");
        int contribution =29000;
        int total1 =0;
        for ( int i = 0; i <= 12 ; i++){
            total1 = total1 +  contribution;
            System.out.println( "месяц " +i+ ", сумма накоплений равна " +total1);
        }
        System.out.println( "задача 9");
        int contribution1 =29000;
        int total2 =0;
        for ( int i = 0; i <=12 ; i++) {
            total2 = total2 + total2/100;
            total2 = total2 + contribution1;

            System.out.println("месяц " + i + ", сумма накоплений равна " + total2);

        }


    }

}