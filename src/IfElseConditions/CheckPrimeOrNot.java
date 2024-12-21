package IfElseConditions;

import java.util.Scanner;


public class CheckPrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int div = 2;
       while(div < n ){
           if (n%div==0){
               System.out.println("not prime");
               break;
           }
           else{
              div = div +1;
           }
       }
       if (div >=n){
           System.out.println("prime");
       }
    }

}
