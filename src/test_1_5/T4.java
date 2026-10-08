package test_1_5;

import java.util.Locale;
import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        int num = scan.nextInt();

        boolean z = ((num > 99 && num < 1000) && (num % 5 == 0)) ? true : false;
        System.out.println(z);
    }
}