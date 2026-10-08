package test_1_5_a;

import java.util.Locale;
import java.util.Scanner;

public class T7A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        double x = scan.nextDouble();
        double y = scan.nextDouble();

        boolean obl1 = x <= 0 && y > 2 * x * x && y > 1-x;
        boolean obl2 = x >= 0 && y > 1-x;
        String res = ((obl1 || obl2) && x < 1) ? "YES" : "NO";
        System.out.println(res);
        //System.out.println(y > x);
    }
}