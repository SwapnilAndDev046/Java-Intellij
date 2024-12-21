package DSA;

import java.util.Scanner;

//give index of num if present else return -1
public class ArrayQ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {3, 4, 56, 6};
        int x = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ans = i;
                System.out.println(ans);
                break;
            } else {
                ans = -1;
                System.out.println(ans);
                break;
            }
        }
    }
}
