package test_1_5_a;

import java.util.Locale;
import java.util.Scanner;

public class T5A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        double x = scan.nextDouble();
        double y = scan.nextDouble();

        boolean global = x * x + y * y < 1;
        boolean obl1 = x < 0;
        boolean obl2 = y > x;
        String res = global && (obl1 || obl2) ? "YES" : "NO";
        System.out.println(res);
    }
}