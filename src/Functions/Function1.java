package Functions;
import java.util.Scanner;
public class Function1 {
    public static void main (String []args){
Scanner sc = new Scanner(System.in);
String name = sc.nextLine();
PrintMyName(name);
    }
    public static void PrintMyName(String name){
        System.out.println(name);// this line calls the function
        return;
    }
}
