package IfElseConditions;

import java.util.Scanner;

public class AreaPeri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter len:");
        int len = sc.nextInt();
        System.out.print("enter bre:");
        int bre = sc.nextInt();
        int area = len * bre;
        int peri = 2 * (len + bre);
    if(area > peri){
        System.out.println("perimeter:"+peri);
        System.out.println("area:"+area);
        System.out.println("Area is greater than perimeter");
    }
    else if (area < peri){
        System.out.println("perimeter:"+peri);
        System.out.println("area:"+area);
        System.out.println("perimeter is greater than area");
    }
    else {
        System.out.println("both same");
    }
    }
}
