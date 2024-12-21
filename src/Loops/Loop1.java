package Loops;

import java.util.Scanner;

//print prime numbers from 1 to 100.
public class Loop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int div = 0;
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                //// we will get 2 in output cause inner loop will become j=2;j<2;j++ which is wrong so code won't get run
                if (i % j == 0) {
                    div = div + 1;
                }

            }
            if (div == 0) {
                System.out.println(i);
            } else {
                div = 0;// it is zero for next element(new start will happened after here)
            }

        }
    }
}
