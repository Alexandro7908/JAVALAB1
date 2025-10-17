import java.util.InputMismatchException;
import java.util.Scanner;

public class zad110 {
    public static int lastNumSum(int a, int b) {
        return (a % 10) + (b % 10);
    }

    static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            int a = sc.nextInt();
            System.out.print("Введите второе число: ");
            int b = sc.nextInt();
            System.out.print("Ответ: " + lastNumSum(a,b));
        } catch (InputMismatchException e) {
            System.out.println("Неверный ввод!");
        }
    }
}
