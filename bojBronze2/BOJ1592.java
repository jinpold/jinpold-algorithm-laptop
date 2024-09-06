package bojBronze2;

import java.util.Scanner;

public class BOJ1592 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int L = sc.nextInt();
        int[] arr = new int[N];
        int result = 0;
        int ball = 0;
        while (true) {
            arr[ball]++;
            if (arr[ball] == M) {
                break;
            }
            if (arr[ball] % 2 == 1) {
                ball = (ball + L) % N;
            } else {
                ball = (ball - L + N) % N;
            }
            result++;
        }
        System.out.println(result);
    }
}
