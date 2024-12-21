package IfElseConditions;
import java.util.Scanner;
public class DivisibleBy5AndNotBy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n:");
        int n = sc.nextInt();
        if (n % 5 == 0 && n % 3 != 0)
        {
            System.out.println("divisible by 5 and not divisible by 3");
        }
        else if(n % 5 != 0 && n % 3 == 0)
        {
            System.out.println("divisible by 3 and not divisible by 5");
        }
        else if (n % 5 != 0 && n % 3 != 0) {
            System.out.println("not divisible by 5 and 3");
        }
        else{
            System.out.println("divisible by both");
        }
    }
}
