package Loops;
/*Nested loop in java first we will see the star in 1-D */
import java.util.Scanner;
/*
public class Loop5 {
    public static void main(String[] args) {
        for (int i=1;i<=4;i++){
            System.out.print("*\t");
        }
    }
}
*/
/*For 2-D*/
public class Loop5 {
    public static void main(String[] args) {
        for(int Rows=1;Rows<=6;Rows++){

            for(int column=Rows;column<=6;column++)//the which row it is the no. of column present in it.

            {
                System.out.print("* ");
            }
            System.out.println( );


        }
    }
}