import java.util.Scanner;

public class BreakContinueTasks {
    static void main(String[] args) {
        //Проверка метода вывода суммы
        //sumUntilFirstNegative();

        //Проверка работы метода пропуска чисел, которые делятся на 3
        //skipMultiplesOfThree();

        //Проверка работы метода вывода только положительных чисел
        printPositiveNumbers();

        //Проверка работы метода ввода строк до команды "stop"
        //readLinesUntilStop();
    }

    /**
     * Метода вывода суммы чисел до первого отрицательного числа
     */
    public static void sumUntilFirstNegative() {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        int sum = 0;

        while(true) {
            System.out.print("Введите число: ");
            number = scanner.nextInt();

            if (number < 0) {
                sum += number;
                System.out.println("Выполнение программы завершено!");
                break;
            }

            sum += number;
        }

            System.out.println("Сумма чисел равна " + sum);

        scanner.close();
    }

    /**
     * Метода пропуска чисел, которые делятся на 3
     */
    public static void skipMultiplesOfThree() {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }

            System.out.println(i);
        }
    }

    /**
     * Метода вывода только положительных чисел
     */
    public static void printPositiveNumbers() {
        Scanner scanner = new Scanner(System.in);

        int number = 0;

        while(true) {
            System.out.print("Введите число: ");
            number = scanner.nextInt();
            if (number < 0) {
                continue;
            }

            if (number == 0) {
                System.out.print("Выполнение программы завершено!");
                break;
            }

            System.out.println(number);
        }

        scanner.close();
    }

    /**
     * Метод ввода строк до команды "stop"
     */
    public static void readLinesUntilStop() {
        Scanner scanner = new Scanner(System.in);

        String userCommand = "";

        while (true) {
            System.out.print("Введите команду: ");
            userCommand = scanner.nextLine();
            if (userCommand.equals("stop")) {
                System.out.println("Выполнение программы завершено!");
                break;
            }
        }

        scanner.close();
    }
}
