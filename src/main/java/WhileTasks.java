import java.util.Scanner;

public class WhileTasks {
    static void main(String[] args) {
        //Проверка работы метода вычисления факториала
        //getFactorial();

        //Проверка работы метода вывода всех четных чисел до заданного
        //printEvenNumbers();

        //Проверка работы метода обратного отсчета от введенного числа
        //printCountDown();
    }


    /**
     * Метод вычисления факториала с помощью while
     */
    public static void getFactorial() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int result = 1;
        int i = 1;

        while (i <= number) {
            result *= i;
            i++;
        }

        System.out.println("Факториал числа " + number + " равен " + result);
    }

    /**
     * Метод вывода всех четных чисел до заданного
     */
    public static void printEvenNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int i = 1;

        while (i <= number) {
            if (i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }

    /**
     * Метод обратного отсчета от введенного числа
     */
    public static void printCountDown() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int i = 1;

        while (i <= number) {
            System.out.println(number);
            number--;
        }

    }
}
