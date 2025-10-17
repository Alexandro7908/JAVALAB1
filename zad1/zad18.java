import java.util.InputMismatchException;
import java.util.Scanner;
public class zad18 {
    public static boolean isdivisor(int a,int b){
        if (a%b == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        try{
            Scanner in = new Scanner(System.in);
            int num_a = in.nextInt();
            int num_b = in.nextInt();
            boolean result = isdivisor(num_a,num_b);
            System.out.println(result);
        }
        catch (InputMismatchException e){
            System.out.println("Неверный ввод!");
        }
    }
}
