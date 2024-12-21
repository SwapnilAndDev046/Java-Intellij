package IfElseConditions;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Year:");
        int Year = sc.nextInt();
        System.out.print("the Year is:");
        if(Year % 4 == 0){
            System.out.println("leap year");
        }
        else{
            System.out.println("not a leap year");
        }
    }
}
