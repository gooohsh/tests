package test_1_5_a;

import java.util.Locale;
import java.util.Scanner;

public class T1A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        double x = scan.nextDouble();
        double y = scan.nextDouble();

        String res = ((x * x + y * y > 4) && (x < 2) && (y > 0) && (y < x)) ? "YES" : "NO";
        System.out.println(res);
    }
}
