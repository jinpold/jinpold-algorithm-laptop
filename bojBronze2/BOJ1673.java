package bojBronze2;

import java.util.Scanner;

public class BOJ1673 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int result = N;
            while (N >= K) {
                result += N / K;
                N = N / K + N % K;
            }
            System.out.println(result);
        }
    }
}
