package test_1_5;

import java.util.Locale;
import java.util.Scanner;

public class T6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        int numA = scan.nextInt();
        int numB = scan.nextInt();
        int numC = scan.nextInt();
        boolean z1 = (numA % 2 == 0) ? true : false;
        boolean z2 = (numB % 2 == 0) ? true : false;
        boolean z3 = (numC % 2 == 0) ? true : false;
        System.out.println((z1 && z2) || (z2 && z3) || (z1 && z3));
    }
}