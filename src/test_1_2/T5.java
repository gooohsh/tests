package test_1_2;

import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();

        int minutes = (seconds % 3600) / 60;
        int hours = (seconds / 3600) % 24; //3600 секунд = 1 час
        int secs = seconds % 60;

        String mins = "";
        if (minutes < 10) {
            mins = "0" + minutes;
        } else {
            mins = String.valueOf(minutes);
        }
        String secs1 = "";
        if (secs < 10) {
            secs1 = "0" + secs;
        } else {
            secs1 = String.valueOf(secs);
        }

        System.out.println(hours + ":" + mins + ":" + secs1);
    }
}
