package Loops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int div = 0;
        int n = sc.nextInt();
        for (i = 2; i <= n; i++) // 2 3 4 5 6 7 8 9..............n
        {
            for (int j = 2; j <= i - 1; j++) // 2 3 4 5 6 7 8 9.............n-1
            {
                if (i % j == 0) // j ha i la divide kartana ek ne chota asnar jar to divide
                    // zhal div +1 honar which means not prime
                {
                    div = div + 1;
                }
            }
            if (div == 0) {
                System.out.println(i);
            } else {
                div = 0; // Rests thye value for other for next number
            }
        }
    }

}
