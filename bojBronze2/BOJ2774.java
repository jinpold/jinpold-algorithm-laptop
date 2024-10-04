package bojBronze2;

import java.util.Scanner;

public class BOJ2774 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            String input = sc.next();
            int[] arr = new int[10];
            for (int j = 0; j < input.length(); j++) {
                arr[input.charAt(j) - '0']++;
            }
            int count = 0;
            for (int j = 0; j < 10; j++) {
                if (arr[j] != 0) {
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}
