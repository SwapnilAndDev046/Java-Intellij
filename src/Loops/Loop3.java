package Loops;
import java.util.Scanner;
public class Loop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i = s.length();
        while (i >0){

            System.out.print(s.charAt(i-1));
            i--;
        }
    }
}
