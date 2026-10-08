package test_1_5;

import java.util.Locale;
import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        double num = scan.nextDouble();
        int a = 3;
        int b = 8;
        boolean isInPoint = (num >= a && num <= b) ? true : false;
        System.out.println(isInPoint);
    }
}
