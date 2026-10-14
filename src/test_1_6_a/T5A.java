package test_1_6_a;

import java.util.Scanner;

public class T5A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int z;

        if (a > b) {
            z = a;
            a = b;
            b = z;
        }

        if (b > c) {
            z = b;
            b = c;
            c = z;
        }

        if (a > b){
            z = a;
            a = b;
            b = z;
        }

        System.out.println(a + " " + b + " " + c);
    }
}
