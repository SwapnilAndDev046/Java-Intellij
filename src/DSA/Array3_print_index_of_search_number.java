package DSA;
//print index of the number which i have print

import java.util.Scanner;

public class Array3_print_index_of_search_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("number want to find\n");
        int r = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (r == arr[i]) {
                System.out.println(i);
                found = true;
            }

        }
        if(!found){
            System.out.println("error");
        }


    }

}



