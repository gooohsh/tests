package test_1_6_a;

import java.util.Scanner;

public class T2A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        int dayMonth = scan.nextInt();

        if (month > 12 || dayMonth > 31) {
            System.out.println(-1);
            return;
        }

        int validate = 0;

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                validate = 30;
                break;
            case 2:
                validate = 28;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                validate = 31;
        }
        if (dayMonth > validate) {
            System.out.println(-1);
            return;
        }

        int res = 0;

        switch (month) {
            case 1:
                res = 0;
                break;
            case 2:
                res = 31;
                break;
            case 3:
                res = 59;
                break;
            case 4:
                res = 90;
                break;
            case 5:
                res = 120;
                break;
            case 6:
                res = 151;
                break;
            case 7:
                res = 181;
                break;
            case 8:
                res = 212;
                break;
            case 9:
                res = 243;
                break;
            case 10:
                res = 273;
                break;
            case 11:
                res = 304;
                break;
            case 12:
                res = 334;
                break;
        }

        int sumDays = (res + dayMonth);
        System.out.println(365 - sumDays);
    }
}