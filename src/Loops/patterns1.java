package Loops;
//i=1*
//i=2* *
//i=3* * *
//i=4* * * *
//i=5* * * * *
public class patterns1 {
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
