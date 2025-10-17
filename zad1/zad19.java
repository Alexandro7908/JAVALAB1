import java.util.InputMismatchException;
import java.util.Scanner;
public class zad19 {
    public static boolean isEqual(int a, int b, int c) {
        return a == b && b == c;
    }
    public static void main(String[] args){
        try {
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            boolean result = isEqual(a, b, c);
            System.out.println(result);
        }
        catch (InputMismatchException e){
            System.out.println("Неверный ввод!");
        }
    }
}
