package bojBronze2;

import java.util.Scanner;

public class BOJ1668 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int left = 0;
        int right = 0;
        int leftMax = 0;
        int rightMax = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] > leftMax) {
                leftMax = arr[i];
                left++;
            }
            if (arr[N - 1 - i] > rightMax) {
                rightMax = arr[N - 1 - i];
                right++;
            }
        }
        System.out.println(left);
        System.out.println(right);
    }
}
