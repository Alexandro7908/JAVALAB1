import java.util.Scanner;
import java.util.InputMismatchException;
public class zad31 {
    public static String listNums(int x) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= x; i++) {
            if (i > 0) {
                sb.append(" ");
            }
            sb.append(i);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите целое положительное число: ");
            int x = sc.nextInt();
            if (x<0){
                System.out.println("Число должно быть положительным!");
                System.exit(1);
            }
            System.out.println("Ответ:" + " " + listNums(x));
        }
        catch (InputMismatchException e){
            System.out.println("Неверный ввод!");
        }

    }
}
