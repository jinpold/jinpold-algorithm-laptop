package bojBronze2;

import java.util.Scanner;

public class BOJ1453 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[101];
        int result = 0;
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (arr[num] == 1) {
                result++;
            } else {
                arr[num] = 1;
            }
        }
        System.out.println(result);
    }
}
