import java.util.Scanner;

public class IfElseTasks {
    static void main(String[] args) {
        //Проверка метода определения знака числа
        //getSign();

        //Проверка метода поиска наибольшего из двух чисел
        //getMax();

        //Проверка метода вывода оценки
        //getRating();

        //Проверка метода проверки на четность
        //checkParity();

        //Проверка метода определения размера скидким по возрасту
        //calculateDiscount();

        //Проверка метода оценки результата теста по баллам
        //getTestScore();

    }

    /**
     * Метод определения знака числа
     */
    public static void getSign() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Число положительное");
        } else if (number < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число равно нулю");
        }

        scanner.close();
    }

    /**
     * Метод поиска наибольшего из двух чисел
     */
    public static void getMax() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            System.out.print("Наимбольшее число: " + firstNumber);
        } else if (firstNumber < secondNumber) {
            System.out.print("Наимбольшее число: " + secondNumber);
        } else {
            System.out.print("Числа равны");
        }

        scanner.close();
    }

    /**
     * Метод вывода оценки по шкале 1-5
     */
    public static void getRating() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите оценку: ");
        int number = scanner.nextInt();

        if (number == 5) {
            System.out.print("Отлично");
        } else if (number == 4) {
            System.out.print("Хорошо");
        } else if (number == 3) {
            System.out.print("Удовлетворительно");
        } else if (number == 1 || number == 2){
            System.out.print("Неудовлетворительно");
        } else {
            System.out.print("Введена некорректная оценка");
        }

        scanner.close();
    }

    /**
     * Метод проверки на четность
     */
    public static void checkParity() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.print("Число четное");
        } else {
            System.out.print("Число нечетное");
        }

        scanner.close();
    }

    /**
     * Метод определения размера скидки по возрасту
     */
    public static void calculateDiscount() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("Размер скидки составляет 25%");
        } else if (age >= 65) {
            System.out.print("Размер скидки составляет 30%");
        } else {
            System.out.print("Скидка отсутвует");
        }

        scanner.close();
    }

    /**
     * Метод оценки результата теста по баллам
     */
    public static void getTestScore() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество баллов: ");
        int number = scanner.nextInt();

        if (number >= 90) {
            System.out.print("Отлично");
        } else if (number >= 75) {
            System.out.print("Хорошо");
        } else if (number >= 60) {
            System.out.print("Удовлетворительно");
        } else if (number >= 0) {
            System.out.print("Неудовлетворительно");
        } else {
            System.out.print("Введено некорректное количество баллов");
        }

        scanner.close();
    }
}
