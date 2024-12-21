package DSA;
import java.util.Scanner;
//create array 5 floats and add them
public class ArrayQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        float sum=0;
        float  nums []= new float [size];
        for(int i=0;i<size;i++){
            nums[i]= sc.nextFloat();
        }
        for(int i=0;i<size;i++){
            sum=sum+nums[i];
        }
        System.out.println(sum);
    }


}
