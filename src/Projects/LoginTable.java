package Projects;

import java.util.Scanner;

public class LoginTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the UserName:");
        String UserName = sc.next();
        int Password =0;

        while (true) {
            System.out.print("Enter the Password:");
            Password = sc.nextInt();
            if (Password<=99999999 || Password>=10000000) {
                System.out.println("username and password has been saved Login Confirm.");
                break;
            }
            else{
                System.out.println("password should be 8 character long!!!");
            }

        }

    }
}
