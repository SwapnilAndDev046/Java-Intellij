package IfElseConditions;
import java.util.Scanner;
public class divisibleBy5And3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n:");
        int n = sc.nextInt();
        if (n % 5 == 0 && n % 3 == 0)
        {
            System.out.println("divisible by 5 and 3");
        }
        else {
            System.out.println("not divisible by 5 and 3");
        }
    }
}
