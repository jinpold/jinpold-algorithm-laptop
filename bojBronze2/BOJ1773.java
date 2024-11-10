package bojBronze2;

import java.util.Scanner;

public class BOJ1773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        int[] arr = new int[C];
        for (int i = 0; i < N; i++) {
            int student = sc.nextInt();
            for (int j = 1; j <= C; j++) {
                if (j % student == 0) {
                    arr[j - 1] = 1;
                }
            }
        }
        int result = 0;
        for (int i = 0; i < C; i++) {
            if (arr[i] == 1) {
                result++;
            }
        }
        System.out.println(result);
    }
}
