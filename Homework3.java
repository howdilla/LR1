import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x, n;

        System.out.print("Введите значение x: ");
        x = scanner.nextInt();

        do {
            System.out.print("Введите значение n: ");
            n = scanner.nextInt();

            if (n > 14 || n < -14) {
                System.out.println("Неверные входные данные!!!");
            }
        } while (n > 14 || n < -14);

        if (n == 0) {
            x = 1;
            System.out.print(x);
        }

        if (n > 0) {
            int r = 1;
            for (int i = 0; i < n; i++) {
                r *= x;
            }
            System.out.print(r);

        }
        if (n < 0) {
            float r = 1;
            for (int i = 0; i > n; i--) {
                r /= x;
            }
            System.out.print(r);
        }

    }
}
