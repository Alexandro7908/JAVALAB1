import java.util.InputMismatchException;
import  java.util.Scanner;
public class zad22 {
    public static int safeDivide(int x, int y) {
        if (y == 0) {
            return 0;
        }
        return x / y;
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите числа x и y: ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(safeDivide(x,y));
        }
        catch (InputMismatchException e){
            System.out.println("Неверный ввод!");
        }
    }
}
