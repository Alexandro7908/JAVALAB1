import java.util.InputMismatchException;
import java.util.Scanner;
public class zad14 {
    public static boolean ispositive(int num){
        return num>0;
    }
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите число: ");
            int num = in.nextInt();
            boolean result = ispositive(num);
            System.out.println(result);
        }
        catch (InputMismatchException e){
            System.out.println("Неверный ввод!");
        }
    }

}