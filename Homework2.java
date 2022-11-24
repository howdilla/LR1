import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int day, month;

        do {
            System.out.print("Введите день: ");
            day = scanner.nextInt();

            if (day < 1 || day > 31) {
                System.out.println("Неверные входные данные!!!");
            }
        } while (day < 1 || day > 31);


        do {
            System.out.print("Введите месяц: ");
            month = scanner.nextInt();

            if (month < 1 || month > 12) {
                System.out.println("Неверные входные данные!!!");
            }
        } while (month < 1 || month > 12);

        if (month == 2 && day > 29) {
            System.out.println("Неверные входные данные!!!");
            System.exit(0);
        }

        if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
            System.out.println("Неверные входные данные!!!");
            System.exit(0);
        }

        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Зима");
        }

        if (month == 3 || month == 4 || month == 5) {
            System.out.println("Весна");
        }

        if (month == 6 || month == 7 || month == 8) {
            System.out.println("Лето");
        }

        if (month == 9 || month == 10 || month == 11) {
            System.out.println("Осень");
        }
    }
}
