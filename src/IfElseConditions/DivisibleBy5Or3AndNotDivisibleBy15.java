package IfElseConditions;
import java.util.Scanner;
public class DivisibleBy5Or3AndNotDivisibleBy15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ((n%5==0 || n%3==0) && n%15!=0){
            System.out.println("DivisibleBy5Or3AndNotDivisibleBy15");

        }
        else{
            System.out.println("don't match condition");
        }
    }
}
