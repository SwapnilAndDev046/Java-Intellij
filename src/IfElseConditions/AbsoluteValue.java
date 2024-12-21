package IfElseConditions;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the integer:");
        int n = sc.nextInt();
        System.out.print("absolute value of integer is:");
        if(n > 0){
            System.out.println(n);
        }
        else{
            n = n * -1;
            System.out.println(n);
        }
    }

}
