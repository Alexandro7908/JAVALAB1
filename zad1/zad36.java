import java.util.Scanner;
import java.util.InputMismatchException;
public class zad36 {
    public static boolean equalNum(int x) {
        x = Math.abs(x);
        if (x < 10) {
            return true;
        }
        int lastDigit = x % 10;
        while (x > 0) {
            if (x % 10 != lastDigit) {
                return false;
            }
            x /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите число: ");
            int x = sc.nextInt();
            System.out.print("Ответ: " + equalNum(x));
        }
        catch (InputMismatchException e){
            System.out.println("Неверный ввод!");
        }
    }
}
