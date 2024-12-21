package Loops;

import java.util.Scanner;

public class Loop4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rev = 0;
        for (int n = sc.nextInt(); n != 0; n = n / 10) {
            int rem = n % 10;
            rev = rev * 10 + rem;

        }
        System.out.println(rev);
    }
}
