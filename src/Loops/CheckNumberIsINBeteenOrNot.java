package Loops;
import java.util.Scanner;
public class CheckNumberIsINBeteenOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        do{
            System.out.println("it is not bet 1 to 20 try again!!!");
            n = sc.nextInt();
        }while(n > 20 || n<1  );
        System.out.println ("between");
    }

}
