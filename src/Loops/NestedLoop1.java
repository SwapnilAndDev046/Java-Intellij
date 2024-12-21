package Loops;
import java.util.Scanner;
public class NestedLoop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i , j;
        for (i = 0; i < 3; i++){
            for (j=0;j<2;j++){
                System.out.println(i+""+j);
            }

        }
    }
}
