package pract2;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое N: ");
        int n = scanner.nextInt();
        double result = calculateSumOfRoots(n);
        System.out.printf("Сумма ряда: %.5f\n\n", result);

        scanner.close();
    }

    public static double calculateSumOfRoots(int n) {
        double summa = 0.0;
        for (int i = 1; i <= n; i++) {
            summa += Math.sqrt(i);
        }
        return summa;
    }
}