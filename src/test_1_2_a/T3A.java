package test_1_2_a;

import java.util.Scanner;

public class T3A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nums = scanner.nextInt();

        int poslednee = nums % 10;
        int second = (nums % 100) / 10;
        int first = nums / 100;
        System.out.println(first + second + poslednee);
    }
}
