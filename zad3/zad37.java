import java.util.Scanner;
import java.util.InputMismatchException;
public class zad37 {
    public static void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите число: ");
            int x = sc.nextInt();
            square(x);
        } catch (InputMismatchException e) {
            System.out.println("Неверный ввод!");
        }
    }
}