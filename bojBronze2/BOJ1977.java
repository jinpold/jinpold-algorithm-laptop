package bojBronze2;

import java.util.Scanner;

public class BOJ1977 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;
        int min = 0;
        for (int i = M; i <= N; i++) {
            if (Math.sqrt(i) % 1 == 0) {
                sum += i;
                if (min == 0) {
                    min = i;
                }
            }
        }
        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
