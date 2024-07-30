package bojBronze3;

import java.util.Scanner;

public class BOJ9325 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int S = sc.nextInt();
            int N = sc.nextInt();
            for (int j = 0; j < N; j++) {
                int Q = sc.nextInt();
                int P = sc.nextInt();
                S += Q * P;
            }
            System.out.println(S);
        }
        sc.close();
    }
}
