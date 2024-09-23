package bojBronze2;

import java.util.Scanner;

public class BOJ2028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int square = N * N;
            if (String.valueOf(square).endsWith(String.valueOf(N))) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
