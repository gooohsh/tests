package test_1_2;

import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rub = scanner.nextInt(); //2
        int kopeyki = scanner.nextInt(); //50
        int pirozhki = scanner.nextInt(); //4

        //System.out.println(kopeyki * pirozhki / 100); //рубля дополнительных (2)


        int add;
        int ostatokKopeek;
        ostatokKopeek = kopeyki * pirozhki % 100; //32
        add = kopeyki * pirozhki / 100; //628

        System.out.println((rub * pirozhki + add) + " " + ostatokKopeek);
    }
}
