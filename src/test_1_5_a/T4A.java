package test_1_5_a;

import java.util.Locale;
import java.util.Scanner;

public class T4A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        double x = scan.nextDouble();
        double y = scan.nextDouble();

        boolean global = y > x * x - 2;
        boolean obl1 = y < -x;
        boolean obl2 = y < x; //p
        String res = global && (obl1 || obl2) ? "YES" : "NO";
        System.out.println(res);
    }
}