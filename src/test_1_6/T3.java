package test_1_6;

import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int poslednee = a % 10;
        int poslednee2 = a % 100;

        String res = "";

        if (poslednee2 >= 11 && poslednee2 <= 14) {
            res = a + " TORTOV";
        } else {
            switch (poslednee) {
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    res = a + " TORTOV";
                    break;
                case 2:
                case 3:
                case 4:
                    res = a + " TORTA";
                    break;
                case 1:
                    res = a + " TORT";
                    break;
            }
        }

        System.out.println(res);
    }
}