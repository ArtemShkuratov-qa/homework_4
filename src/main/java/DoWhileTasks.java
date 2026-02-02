import java.util.Scanner;

public class DoWhileTasks {
    static void main(String[] args) {
        //Проверка метода запроса положительного числа
        //readPositiveNumber();

        //Проверка метода проверки пароля
        //checkPassword();

        //Проверка работы метода вывода чисел от 1 до 10
        //printNumbers();

        //Проверка работы метода завершения программы
        //exitOnCommand();

        //Проверка работы метода подсчета количества цифр в числе
        //countDigits();

    }

    /**
     * Метод запроса положительного числа
     */
    public static void readPositiveNumber() {
        Scanner scanner = new Scanner(System.in);

        int number = 0;

        do {
            System.out.print("Введите число: ");
            number = scanner.nextInt();
        } while (number <= 0);
    }

    /**
     * Метод проверки пароля
     */
    public static void checkPassword() {
        Scanner scanner = new Scanner(System.in);

        String systemPassword = "qwerty";
        String userPassword = "";

        do {
            System.out.print("Введите пароль: ");
            userPassword = scanner.nextLine();
        } while (!userPassword.equals(systemPassword));
    }

    /**
     * Метод вывода чисел от 1 до 10
     */
    public static void printNumbers() {
        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    /**
     * Метода завершения программы
     */
    public static void exitOnCommand() {
        Scanner scanner = new Scanner(System.in);

        String userCommand = "";

        do{
            System.out.print("Введите команду: ");
            userCommand = scanner.nextLine();
        } while (!userCommand.equals("exit"));

        System.out.print("Работа программы завершена!");
    }

    /**
     * Метод подсчета количества цифр в числе
     */
    public static void countDigits() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int count = 0;

        do{
            number = number/10;
            count++;
        } while (number > 0);

        System.out.print("Количество цифр равно " + count);
    }

}
