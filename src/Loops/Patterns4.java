package Loops;
//    *
//   **
//  ***
// ****
//*****
public class Patterns4 {
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=5-i ; j++)//pahilya row madhe blank space j=1 shows colums chi start/ n-i shows blank spaces
            {
                System.out.print("  ");
            }

            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}
