import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите количество точек: ");
        int N = in.nextInt();

        System.out.print("Введите радиус: ");
        int R = in.nextInt();

        int count = 0;

        for(int i = 0 ; i<N;i++) {

            System.out.print("X" + (i + 1) + " координату: ");
            float X = in.nextFloat();

            System.out.print("Y" + (i + 1) +  " координату: ");
            float Y = in.nextFloat();

            if(X * X + Y * Y <= R * R) {
                count += 1;
            }

        }
        System.out.println(count + " точек попали в окружность");
    }
}
