import java.util.Scanner;

public class SwitchTasks {
    static void main(String[] args) {
        //Проверка метода вывода дня недели по номеру
        //printDay();

        //Проверка метода определения стоимости билета по дню недели
        //getTicketPrice();

        //Проверка метода перевода числовых оценок в буквенные
        //convertScoreToGrade();

        //Проверка метода обработки текстовых команд
        //printSystemStatus();

        //Проверка метода простой калькуляции
        //printResult();
    }

    /**
     * Метод для вывода дня недели по номеру
     */
    public static void printDay() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер дня: ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.print("Понедельник");
                break;
            case 2:
                System.out.print("Вторник");
                break;
            case 3:
                System.out.print("Среда");
                break;
            case 4:
                System.out.print("Четверг");
                break;
            case 5:
                System.out.print("Пятница");
                break;
            case 6:
                System.out.print("Суббота");
                break;
            case 7:
                System.out.print("Воскресенье");
                break;
            default:
                System.out.print("Введен некорректный номер дня");
        }
    }

    /**
     * Метода для вывода стоимости билета по дню недели
     */
    public static void getTicketPrice() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер дня недели: ");
        int day = scanner.nextInt();

        switch (day) {
            case 1, 2, 3, 4, 5:
                System.out.print("Стоимость билета - 300 рублей");
                break;
            case 6, 7:
                System.out.print("Стоимость билета - 450 рублей");
                break;
            default:
                System.out.print("Введен некорректный номер дня");
        }
    }

    /**
     * Метод перевода числовых оценок в буквенные
     */
    public static void convertScoreToGrade() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите оценку: ");
        int number = scanner.nextInt();

        if (number >= 90 && number <= 100){
            System.out.println("A");
        } else if (number >= 80 && number <= 89) {
            System.out.println("B");
        } else if (number >= 70 && number <= 79) {
            System.out.println("C");
        } else if (number >= 60 && number <= 69) {
            System.out.println("D");
        } else if (number >= 0 && number <= 59) {
            System.out.println("F");
        } else {
            System.out.print("Введена некорректная оценка");
        }
    }

    /**
     * Метода обработки текстовых команд
     */
    public static void printSystemStatus() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите команду: ");
        String commandValue = scanner.nextLine();

        switch (commandValue) {
            case "start":
                System.out.println("Система запущена");
                break;
            case "stop":
                System.out.println("Система остановлена");
                break;
            case "restart":
                System.out.println("Система перезапущена");
                break;
            case "status":
                System.out.println("Получение статуса системы");
                break;
            default:
                System.out.println("Получена некорректная команда");
        }
    }

    /**
     * Метод для калькуляции с использованием switch
     */
    public static void printResult() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int firstNumber = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Введите операцию: ");
        String operator = scanner.nextLine();

        System.out.print("Введите второе число: ");
        int secondNumber = scanner.nextInt();

        switch (operator) {
            case "+":
                System.out.print("Сумма двух чисел равна " + (firstNumber + secondNumber));
                break;
            case "-":
                System.out.print("Разница двух чисел равна " + (firstNumber - secondNumber));
                break;
            case "*":
                System.out.print("Произведение двух чисел равно " + (firstNumber * secondNumber));
                break;
            case "/":
                if (secondNumber == 0) {
                    System.out.print("Деление на ноль недопустимо");
                }

                System.out.print("Результат деления двух чисел равен " + (firstNumber / secondNumber));
                break;
            default:
                System.out.print("Введена некорректная операция");
        }
    }
}
