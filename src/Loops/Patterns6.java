package Loops;

//1
//01
//101
//0101
//10101

public class Patterns6 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) // metrics Logic Use zhala aahe ithe odd coordinates var 0 ahhe
                // and even coordinate var 1 aahe e.g(1,1)=1 and (3,4)=0

                {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
