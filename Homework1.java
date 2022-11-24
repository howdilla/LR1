import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {

        int currentday = 25, currentmonth = 11, currentyear = 2022, day, month, year;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Введите ваш год рождения: ");
            year = scanner.nextInt();

            if (year < 1000 || year > 2022) {
                System.out.println("Неверные входные данные!!!");
            }
        } while (year < 1000 || year > 2022);

        do {
            System.out.print("Введите ваш месяц рождения: ");
            month = scanner.nextInt();

            if (month < 1 || month > 12) {
                System.out.println("Неверные входные данные!!!");
            }
        } while (month < 1 || month > 12);

        do {
            System.out.print("Введите ваш день рождения: ");
            day = scanner.nextInt();

            if (day < 1 || day > 31) {
                System.out.println("Неверные входные данные!!!");
            }
        } while (day < 1 || day > 31);

        if (currentmonth > month) {
            System.out.print((currentyear - year) + "лет," + (currentmonth - month) + "месяцев" + (currentday - day) + "дней");
        }

        if (currentmonth < month) {
            System.out.print((currentyear - year - 1) + "лет," + (currentmonth) + "месяцев," + currentday + " дней");
        }

        if (currentmonth == month) {
            if (currentday > day) {
                System.out.print((currentyear - year) + " лет, 0 месяцев и " + (currentday - day) + " дней");
            }

            if (currentday < day) {
                System.out.print((currentyear - year - 1) + " лет, " + (currentmonth) + " месяцев и " + (currentday) + " дней");
            }
        }




    }

}
