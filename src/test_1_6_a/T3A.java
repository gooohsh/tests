package test_1_6_a;

import java.util.Scanner;

public class T3A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        int z = x / 10;
        int f = x % 10;
        String zhestb = "";

        switch (z){
            case 1:
                zhestb += "X";
                break;
            case 2:
                zhestb += "XX";
                break;
            case 3:
                zhestb += "XXX";
                break;
            case 4:
                zhestb += "XL";
                break;
            case 5:
                zhestb += "L";
                break;
            case 6:
                zhestb += "LX";
                break;
            case 7:
                zhestb += "LXX";
                break;
            case 8:
                zhestb += "LXXX";
                break;
            case 9:
                zhestb += "XC";
                break;
            case 10:
                zhestb += "C" ;
                break;
        }

        switch (f) {
            case 1:
                zhestb += "I";
                break;
            case 2:
                zhestb += "II";
                break;
            case 3:
                zhestb += "III";
                break;
            case 4:
                zhestb += "IV";
                break;
            case 5:
                zhestb += "V";
                break;
            case 6:
                zhestb += "VI";
                break;
            case 7:
                zhestb += "VII";
                break;
            case 8:
                zhestb += "VIII";
                break;
            case 9:
                zhestb += "IX";
                break;
        }
        System.out.println(zhestb);
    }
}