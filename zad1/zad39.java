import java.util.InputMismatchException;
import java.util.Scanner;

public class zad39 {
    public static void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < x - i; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < i; j++) {
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
            rightTriangle(x);
        } catch (InputMismatchException e) {
            System.out.println("Неверный ввод!");
        }
    }
}
