package IfElseConditions;
import java.util.Scanner;
public class ThreeDigitOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n:");
        int n = sc.nextInt();
        if (99 < n && n < 1000) {
            System.out.println("it is 3 digit");

        }
        else{
            System.out.println("not a 3 digit");
        }
    }
}


