package bojBrinze3;

import java.util.Scanner;

public class BOJ2455 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int now = 0;
        for (int i = 0; i < 4; i++) {
            int out = sc.nextInt(); // 내리는사람
            int in = sc.nextInt(); // 타는사람
            now = now - out + in; // 현재 사람수
            max = Math.max(max, now);
        }
        System.out.println(max);
    }
}
