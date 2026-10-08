package test_1_5;

import java.util.Locale;
import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        double num = scan.nextDouble();

        int a1 = -3;
        int a2 = 5;

        int b1 = 9;
        int b2 = 15;

        boolean isInPoint = ((num >= a1 && num <= a2) || (num >= b1 && num <= b2)) ? true : false;
        System.out.println(isInPoint);
    }
}