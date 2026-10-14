package test_1_6;

import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a > b && a > c) {
            if (b < c) System.out.println(b + " " + c + " " + a);
            else System.out.println(c + " " + b + " " + a);
        } else if (a < b && a < c) {
            if (b > c) System.out.println(a + " " + c + " " + b);
            else System.out.println(a + " " + b + " " + c);
        } else if (b > c && b > a) {
            if (a < c) System.out.println(a + " " + c + " " + b);
            else System.out.println(c + " " + a + " " + b);
        } else {
            if (b < a) System.out.println(b + " " + a + " " + c);
            else System.out.println(a + " " + b + " " + c);
        }
    }
}