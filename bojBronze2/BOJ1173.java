package bojBronze2;

import java.util.Scanner;

public class BOJ1173 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int m = sc.nextInt();
        int M = sc.nextInt();
        int T = sc.nextInt();
        int R = sc.nextInt();
        int X = m;
        int time = 0;
        int count = 0;
        while (count < N) {
            if (X + T <= M) {
                X += T;
                count++;
            } else {
                X -= R;
                if (X < m) {
                    X = m;
                }
            }
            time++;
            if (X + T > M && X == m) {
                System.out.println(-1);
                sc.close();
                return;
            }
        }
        System.out.println(time);
    }
}
