import java.util.Scanner;

public class ForTasks {
    static void main(String[] args) {
        //Проверка работы метода вывода чисел
        //printMultiplesOfThree();

        //Проверка работы метода вывода суммы чисел
        //printSumOfNumbers();

        //Проверка работы метода с таблицей умножения
        //printMultiplicationTable();

        //Проверка работы метода на простое число
        //isPrime();

        //Проверка работы метода вывода чисел от 1 до 10
        //printNumbers();
    }


    /**
     * Метод вывода чисел от 1 до 100, делящихся на 3
     */
    public static void printMultiplesOfThree () {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    /**
     * Метод вывода суммы чисел
     */
    public static void printSumOfNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        System.out.print("Сумма чисел равна: " + sum);

        scanner.close();
    }

    /**
     * Метод для таблицы умножения
     */
    public static void printMultiplicationTable() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number*i);
        }

        scanner.close();
    }

    /**
     * Метода проверки на простое число
     */
    public static void isPrime() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        boolean isPrime = true;

        if (number == 1) {
            System.out.print("Передано число 1. Оно не является ни простым, ни составным числом!");
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                isPrime = false;
                System.out.print("Передано составное число");
                break;
            }
        }

        if (isPrime && number != 1) {
            System.out.print("Передано простое число");
        }

        scanner.close();
    }

    /**
     * Метода вывода чисел от 1 до 10
     */
    public static void printNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

}
