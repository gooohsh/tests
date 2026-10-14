package test_1_6_a;

import java.util.Scanner;

public class T4A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if (a == b && c < a) {
            System.out.println(a);
            return;
        }

        if (a > b && a > c) {
            if (b < c) System.out.println(a);
            else System.out.println(a);
        } else if (a < b && a < c) {
            if (b > c) System.out.println(b);
            else System.out.println(c);
        } else if (b > c && b > a) {
            if (a < c) System.out.println(b);
            else System.out.println(b);
        } else {
            if (b < a) System.out.println(c);
            else System.out.println(c);
        }
    }
}