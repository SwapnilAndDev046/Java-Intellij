package IfElseConditions;

import java.util.Scanner;

public class switchcase2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a:");
        int a = sc.nextInt();
        System.out.print("enter b:");
        int b = sc.nextInt();
        System.out.print("\n1.SUM\n2.SUB\n3.MUL\n4.DIV\n5.EXIT\n\nEnter the operation:\n");
        int button = sc.nextInt(); //this should be in a order means over the switch statement
        switch (button) {
            case 1:
                int sum = a + b;
                System.out.print("the soln is:");
                System.out.print(sum);
                break;
            case 2:
                int sub = a - b;
                System.out.print("the soln is:");
                System.out.print(sub);
                break;
            case 3:
                int mul = a * b;
                System.out.print("the soln is:");
                System.out.print(mul);
                break;
            case 4:
                int div = a / b;
                System.out.print("the soln is:");
                System.out.print(div);
                break;
            default:
                System.out.print("Exit");
                break;

        }

    }
}
