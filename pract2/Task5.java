package pract2;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            showMenu();
            int choice = readMenuChoice(scanner);

            switch (choice) {
                case 1:
                    calculateBmi(scanner);
                    break;
                case 2:
                    showAboutProgram();
                    break;
                case 3:
                    isRunning = false;
                    System.out.println("\nСпасибо за использование программы!");
                    break;
            }
        }

        scanner.close();
    }

    public static void showMenu() {
        System.out.println("ГЛАВНОЕ МЕНЮ");
        System.out.println("1. Выполнить расчёт ИМТ");
        System.out.println("2. Информация о программе");
        System.out.println("3. Выход");
    }

    public static int readMenuChoice(Scanner scanner) {
        while (true) {
            System.out.print("Выберите пункт меню (1-3): ");
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                if (choice >= 1 && choice <= 3) {
                    return choice;
                } else {
                    System.out.println("Ошибка: введите число от 1 до 4.");
                }
            } else {
                System.out.println("Ошибка: необходимо ввести целое число");
                scanner.next();
            }
        }
    }

    public static void calculateBmi(Scanner scanner) {
        System.out.println("\nРасчёт индекса массы тела (ИМТ)");

        double weight = readValidDouble(scanner, "Введите ваш вес в кг (0 < вес <= 250): ", 250.0);
        double height = readValidDouble(scanner, "Введите ваш рост в см (0 < рост <= 250): ", 250.0);

        double heightMeters = height / 100.0;
        double bmi = weight / (heightMeters * heightMeters);

        System.out.printf("\nВаш ИМТ: %.2f\n", bmi);
        printBmiCategory(bmi);
    }

    public static double readValidDouble(Scanner scanner, String prompt, double maxLimit) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();
                if (value > 0 && value <= maxLimit) {
                    return value;
                } else {
                    System.out.println("Ошибка: значение должно быть больше 0 и не превышать " + maxLimit);
                }
            } else {
                System.out.println("Ошибка: необходимо ввести число");
                scanner.next();
            }
        }
    }

    public static void printBmiCategory(double bmi) {
        if (bmi < 18.5) {
            System.out.println("Результат: У вас недостаточный вес.");
        } else if (bmi < 25.0) {
            System.out.println("Результат: У вас нормальный вес.");
        } else {
            System.out.println("Результат: У вас избыточный вес.");
        }
    }

    public static void showAboutProgram() {
        System.out.println("\nИнформация о программе");
        System.out.println("Это консольный калькулятор индекса массы тела (ИМТ).");
        System.out.println("Программа позволяет быстро оценить, является ли ваш вес");
        System.out.println("нормальным для вашего роста, используя формулу Кетле.");
    }
}