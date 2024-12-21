package Loops;
//1
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14 15
public class Patterns5 {
    public static void main(String[] args) {
        int number=1;// ha number help karnar ek ek number vadvayla number = number+1
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=i; j++) //since we know no. rows sobat column pn same number ne vadtayt
            {
                System.out.print(number+"   ");  // start input 1
                number++; //number = number + 1;
            }
            System.out.println();
        }
    }
}
