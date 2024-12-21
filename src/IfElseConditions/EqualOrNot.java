package IfElseConditions;

import java.util.Scanner;

public class EqualOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a:");
        int a = sc.nextInt();
        System.out.print("enter b:");
        int b = sc.nextInt();
        if (a - b == 0) {
            System.out.println("a and b are equal");
        } else if (a - b > 0) {

            System.out.println("a is greater");
        } else {
            System.out.println("b is grater");
        }
    }
}
