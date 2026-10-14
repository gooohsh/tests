package test_1_6_a;

import java.util.Scanner;

public class T6A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        int a;
        int b;
        int c;

        if (x >= y && x >= z) {
            c = x;
            a = y;
            b = z;
        } else if (y >= x && y >= z){
            c = y;
            a = x;
            b = z;
        } else {
            c = z;
            a = x;
            b = y;
        }

        if (a + b <= c) {
            System.out.println("impossible");
        } else {
            int a2 = a*a;
            int b2 = b*b;
            int c2 = c*c;

            if (a2 + b2 == c2) {
                System.out.println("right");
            } else if (a2 + b2 < c2) {
                System.out.println("obtuse");
            } else {
                System.out.println("acute");
            }
        }
    }
}
