package test_1_5_a;

import java.util.Locale;
import java.util.Scanner;

public class T2A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        double x = scan.nextDouble();
        double y = scan.nextDouble();

        String res = ((y >= 0 && y <= 0.5) && (y < Math.sin(x) && (x >= 0 && x <= Math.PI))) ? "YES" : "NO";
        System.out.println(res);
    }
}
