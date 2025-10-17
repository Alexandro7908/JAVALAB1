import java.util.InputMismatchException;
import java.util.Scanner;

public class zad25 {
    public static int maxOfThree(int x, int y, int z) {
        int max = x;
        if (y > max) max = y;
        if (z > max) max = z;
        return max;
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите числа x y z: ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            System.out.println(maxOfThree(x,y,z));
        }
        catch (InputMismatchException e){
            System.out.println("Неверный ввод!");
        }
    }
}
