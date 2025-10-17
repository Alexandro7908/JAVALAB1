import java.util.Scanner;
import java.util.InputMismatchException;
public class zad34 {
    public static int pow(int x, int y) {
        if (y < 0) {
            return 0;
        }
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите основание степени: ");
            int x = sc.nextInt();
            System.out.print("Введите показатель степени: ");
            int y = sc.nextInt();
            System.out.println("Ответ: " + pow(x,y));
        }
        catch (InputMismatchException e){
            System.out.println("Неверный ввод!");
        }
    }
}
