package test_1_6_a;

import java.util.Scanner;

public class T1A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        int res = 0;

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                res = 30;
                break;
            case 2:
                res = 28;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                res = 31;
        }

        System.out.println(res);
    }
}
