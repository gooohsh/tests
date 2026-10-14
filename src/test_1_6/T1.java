package test_1_6;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        System.out.println(res(num));
    }

    static String res(int num) {
        if (num < 10 && num >= 0) {
            return "DIGIT";
        } else if (num > 9 && num < 100) {
            return "NUM";
        } else {
            return "OTHER";
        }
    }
}