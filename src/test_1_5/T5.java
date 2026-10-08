package test_1_5;

import java.util.Locale;
import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        int numA = scan.nextInt();
        int num1A = scan.nextInt();
        int num2A = scan.nextInt();
        int num3A = scan.nextInt();

        int num = numA < 0 ? -numA : numA;
        int num1 = num1A < 0 ? -num1A : num1A;
        int num2 = num2A < 0 ? -num2A : num2A;
        int num3 = num3A < 0 ? -num3A : num3A;

        boolean isProtivopolojnoe = ((num == num1 || num == num2 || num == num3 || num1 == num2 || num1 == num3 || num2 == num3)) ? true : false;
        System.out.println(isProtivopolojnoe);
    }
}