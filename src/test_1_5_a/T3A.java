package test_1_5_a;

import java.util.Locale;
import java.util.Scanner;

public class T3A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        double x = scan.nextDouble();
        double y = scan.nextDouble();

        boolean global = y < 2 - x * x;
        boolean oblA = (x < 0) && (y > x) ? true : false;
        boolean oblB = (x >= 0 && y >= 0) ? true : false;
        String res = global && (oblA || oblB) ? "YES" : "NO";
        System.out.println(res);
    }
}
