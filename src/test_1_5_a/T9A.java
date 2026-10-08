package test_1_5_a;

import java.util.Locale;
import java.util.Scanner;

public class T9A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        //< - в окружности
        boolean global = x <= 1 && y <= 1;
        boolean z = x*x+y*y<1 || (x > 0 && y > 0);

        String res = global && z ? "YES" : "NO";
        System.out.println(res);
    }
}