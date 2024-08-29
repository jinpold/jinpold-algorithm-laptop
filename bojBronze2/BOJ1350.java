package bojBronze2;

import java.util.Scanner;

public class BOJ1350 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] files = new long[N];
        long result = 0;
        for (int i = 0; i < N; i++) {
            files[i] = sc.nextLong();
        }
        long cluster = sc.nextLong();
        for (int i = 0; i < N; i++) {
            if (files[i] % cluster == 0) {
                result += files[i] / cluster;
            } else {
                result += files[i] / cluster + 1;
            }
        }
        System.out.println(result * cluster);
    }
}
