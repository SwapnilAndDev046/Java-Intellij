package Loops;
import java.util.Scanner;
public class BestForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.println("num between 2 to 20");
            n = sc.nextInt();
            if (n < 2 || n > 20) {
                System.out.println("TRY AGAIN!!!!!!");

            }
        } while (n < 2 || n > 20);
        System.out.println("well done!!!");
    }
}
