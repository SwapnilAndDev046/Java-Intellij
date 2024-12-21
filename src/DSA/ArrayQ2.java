package DSA;

import java.util.Scanner;
//no is present or not in array
public class ArrayQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("no. to find");
        int x = sc.nextInt();
        boolean find = false;
        for (int i = 0; i < size; i++) {
            if (nums[i] == x) {
               find = true;
               break;
            }
        }
        if (find){
            System.out.println("present");
        }
        else{
            System.out.println("not present");
        }
    }
}
