package pract2;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите вещественное X (|X| < 1): ");
    double x = scanner.nextDouble();
        System.out.print("Введите целое N (> 0): ");
    int n = scanner.nextInt();
    double result = calculateArctanSeries(x, n);
        System.out.printf("Значение выражения: %.5f\n\n",result);
        scanner.close();
    }
    public static double calculateArctanSeries(double x, int n) {
        double summa = 0.0;
        double sign = 1.0;

        for (int i = 0; i <= n; i++) {
            double numerator = Math.pow(x, 2 * i + 1);
            double denominator = 2 * i + 1;

            summa += sign * (numerator / denominator);

            sign = -sign;
        }
        return summa;
    }
}
