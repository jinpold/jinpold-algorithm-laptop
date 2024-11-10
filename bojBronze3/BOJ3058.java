package bojBronze3;

import java.util.Scanner;

public class BOJ3058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int sum = 0;
            int min = 101;
            for (int j = 0; j < 7; j++) {
                int N = sc.nextInt();
                if (N % 2 == 0) {
                    sum += N;
                    min = Math.min(min, N);
                }
            }
            System.out.println(sum + " " + min);
        }
    }
}
