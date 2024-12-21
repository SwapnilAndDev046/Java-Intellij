package IfElseConditions;
import java.util.Scanner;
public class TwoDigitOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        if(n > 9 && n < 100){
            System.out.println("it's a 2 digit");
        }
        else {
            System.out.println("it's not 2 digit");
        }
    }
}
