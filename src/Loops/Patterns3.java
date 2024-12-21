package Loops;

//* * * * *
//*       *
//*       *
//* * * * *
public class Patterns3 {
    public static void main(String[] args) {


        for (int row = 1; row <= 4; row++) {
            for (int col = 1; col <= 5; col++) {
                if (row == 1 || row == 4 || col == 1 || col == 5) //so the full stars is at the end corner okay so there the row is some time 1 or 4 or col is 1 or 4
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }


            System.out.println();
        }
    }
}

