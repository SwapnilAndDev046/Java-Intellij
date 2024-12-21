package Loops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int div = 0;
        int n = sc.nextInt();
        for (i = 2; i <= n; i++) {
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    div = div + 1;
                }
            }
            if (div == 0) {
                System.out.println(i);
            } else {
                div = 0;
            }
        }
    }

}
