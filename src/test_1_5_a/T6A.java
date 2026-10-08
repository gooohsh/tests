package test_1_5_a;

import java.util.Locale;
import java.util.Scanner;

public class T6A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        double x = scan.nextDouble();
        double y = scan.nextDouble();

        boolean global = x * x + y * y < 1;
        boolean obl1_Upper = (x < 0 && y > x && y >= 0) && (y > -x); //область слева, действует y=x и y=-x для исключения тех частичных областей (лево, верх, y>x)
        //первое вроде правильно
        boolean obl1_Downer = (y < x && y <= 0); //область слева, действует y<x (лево, низ, y<x)

        boolean obl2 = x > 0;
        String res = global && ((obl1_Upper || obl1_Downer) || obl2) ? "YES" : "NO";
        System.out.println(res);
        //System.out.println(y > x);
    }
}