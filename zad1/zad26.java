import java.util.InputMismatchException;
import java.util.Scanner;

public class zad26 {
    public static boolean sum3(int x, int y, int z) {
        if (x + y == z) return true;
        if (x + z == y) return true;
        return y + z == x;
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите числа x y z: ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            System.out.println(sum3(x,y,z));
        }
        catch (InputMismatchException e){
            System.out.println("Неверный ввод");
        }
    }
}
