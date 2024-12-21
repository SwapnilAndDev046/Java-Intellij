package Loops;
import java.util.Scanner;
public class SumOfnNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int i , n , sum;
      i=1;
      n = sc.nextInt();
      sum = 0;
      while (i<=n){
          sum = sum + i;
           i++;
      }
        System.out.println(sum);
    }
}
