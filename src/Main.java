
public class Main {
    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1");

        for ( int i = 1; i <=10; i++ ){
            System.out.println(i);
        }

        //Task 2
        System.out.println("Task 2");

        for ( int i = 10; i>=1; i-- ){
            System.out.println(i);
        }

        //Task 3
        System.out.println("Task 3");

        for ( int i = 0; i <= 17; i = i + 2){
            System.out.println(i);
        }

        //Task 4
        System.out.println("Task 4");

        for ( int i = 10; i>=-10; i-- ){
            System.out.println(i);
        }

        //Task 5
        System.out.println("Task 5");

        for ( int i = 1904; i <= 2096; i = i + 4 ){
            System.out.println(i + " год является високосным.");
        }

        //Task 6
        System.out.println("Task 6");

        for ( int i = 7; i <= 98; i = i + 7 ){
            System.out.println(i);
        }

        //Task 7
        System.out.println("Task 7");

        for (int i = 1; i <= 512; i = i * 2){
            System.out.println(i);
        }

        //Task 8
        System.out.println("Task 8");

        int savings = 29000;
        int totalSavings = 0;
        for (int i = 0; i < 12; i ++){
            totalSavings = totalSavings + savings;
        }
        System.out.println(totalSavings);

        //Task 9
        System.out.println("Task 9");

        savings = 29000;
        totalSavings = 0;
        for (int i = 1; i <= 12; i ++){
            totalSavings = totalSavings + totalSavings/100;
            totalSavings = totalSavings + savings;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalSavings + " рублей");
        }
        System.out.println(totalSavings);

        //Task 10
        System.out.println("Task 10");

        int number = 2;
        for (int j = 1; j <= 10; j++){
            int result = number * j;
            System.out.println(number + "*" + j + "=" + result);
        }

    }
}