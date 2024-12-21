package DSA;
// addition of number
import java.util.Scanner;
public class ArrayQ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={1,5,3};
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];

        }
        System.out.println(sum);
    }

}
