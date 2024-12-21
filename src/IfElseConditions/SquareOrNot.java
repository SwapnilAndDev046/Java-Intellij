package IfElseConditions;
import java.util.Scanner;
public class SquareOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter length:");
        int len = sc.nextInt();
        System.out.print("Enter Breath:");
        int bre = sc.nextInt();
        if (len == bre){
            System.out.println("it's a square");
        }
        else{
            System.out.println("not square");
        }

    }
}
