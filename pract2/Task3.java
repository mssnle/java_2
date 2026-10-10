package pract2;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое N (> 0): ");
        int n = scanner.nextInt();
        calculateDigitsSumAndCount(n);

        scanner.close();
    }
    public static void calculateDigitsSumAndCount(int n) {
        int count = 0;
        int summa = 0;

        while (n > 0) {
            int digit = n % 10;
            summa += digit;
            count++;
            n /= 10;
        }

        System.out.println("Количество цифр: " + count);
        System.out.println("Сумма цифр: " + summa);
    }
}
