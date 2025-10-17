import java.util.Scanner;
import java.util.InputMismatchException;
public class zad27 {
    public static int sum2(int x, int y) {
        int sum = x + y;
        if (sum >= 10 && sum <= 19) {
            return 20;
        }
        return sum;
    }

    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите числа x y: ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println("Ответ:" + sum2(x,y));
        }
        catch (InputMismatchException e){
            System.out.println("Неверный ввод");
        }
    }
}
