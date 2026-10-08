package test_1_5_a;

import java.util.Locale;
import java.util.Scanner;

public class T8A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        //< - в окружности
        boolean global = x > 0 && y <= 1;


        boolean inKrug = x * x + y * y < 1;
        boolean z = (inKrug) || (y > x - 1);
        String res = global && z ? "YES" : "NO";
        System.out.println(res);
    }
}