package pract2;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число:");
        int n = scanner.nextInt();
        int result = getSign(n);
        System.out.println("Результат работы: " + result);

        scanner.close();
    }

    public static int getSign(int n) {
        if (n > 0) {
            return 1;
        } else if (n < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}

