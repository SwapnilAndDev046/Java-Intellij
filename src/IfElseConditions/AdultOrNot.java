package IfElseConditions;

import java.util.Scanner;
public class AdultOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("He is an adult");

        }
        else {
            System.out.println("kiddo");
        }
    }

}
