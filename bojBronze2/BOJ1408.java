package bojBronze2;

import java.util.Scanner;

public class BOJ1408 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] now = sc.next().split(":");
        String[] start = sc.next().split(":");
        int nowSec = Integer.parseInt(now[0]) * 3600 + Integer.parseInt(now[1]) * 60 + Integer.parseInt(now[2]);
        int startSec = Integer.parseInt(start[0]) * 3600 + Integer.parseInt(start[1]) * 60 + Integer.parseInt(start[2]);
        int result = startSec - nowSec;
        if (result < 0) {
            result += 24 * 3600;
        }
        System.out.printf("%02d:%02d:%02d", result / 3600, result % 3600 / 60, result % 60);
    }
}
