package IfElseConditions;

import java.util.Scanner;

public class SellAndCostPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("SP:");
        int sp = sc.nextInt();
        System.out.print("CP:");
        int cp = sc.nextInt();
        int diff = sp - cp;
        if (diff > 0) {
            System.out.println("get profit of :" + diff);
        } else if(diff < 0) {
            diff = diff * -1;
            System.out.println("get loss of :" + diff);
        }
        else{
            System.out.println("no profit no loss");
        }

    }


}
