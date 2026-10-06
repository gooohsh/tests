package test_1_2_a;

import java.util.Scanner;

public class T4A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();

        System.out.println(side1 * side1 + side2 * side2);
    }
}
