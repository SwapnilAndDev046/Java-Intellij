package Projects;

import java.util.*;

public class AccurateAge {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int Age;
        while (true) //
        {
            System.out.println("Enter Your Age:");
            Age = sc.nextInt();
            if (Age <= 120 && Age >= 0) {
                System.out.println("Your Age Has been Saved.");
                break;
            }
else{
                System.out.println("Invalid Input Try Again!!");
            }
        }

    }
}
