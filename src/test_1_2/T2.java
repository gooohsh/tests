package test_1_2;

import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int poslednyaa = num % 10;
        int predposlednyaa = (num / 10 % 10);
        int pervaya = (num / 100 % 10);
//        System.out.println(poslednyaa);
//        System.out.println(predposlednyaa);
//        System.out.println(pervaya);
        System.out.println(poslednyaa + predposlednyaa + pervaya);
    }
}
