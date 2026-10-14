package test_1_6;

import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        //A|x|+B>0

        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a == 0) {
            if (b > 0) {
                System.out.println("any x");
            } else {
                System.out.println("no such x");
            }
        } else if (a > 0) {
            if (b > 0) {
                System.out.println("any x");
            } else {
                double x = (double) b/a;
                System.out.println("x<" + Math.round(x * 10.0) / 10.0 + " or x>" + -Math.round(x * 10.0) / 10.0);
            }
        } else {
            if (b <= 0) {
                System.out.println("no such x");
            } else {
                double x = (double) b/a;
                System.out.println(Math.round(x * 10.0) / 10.0 + "<x<" + -Math.round(x * 10.0) / 10.0);
            }
        }
    }
}