package Projects;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 1;
        for (int i = 1; i <= 10; i++) {
          ans=n*i;
            System.out.println(n+"*"+i+"="+ans);
        }

    }
}
