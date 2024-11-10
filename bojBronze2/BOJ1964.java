package bojBronze2;

import java.util.Scanner;

public class BOJ1964 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 5;
        for (int i = 2; i <= N; i++) {
            result += (3 * i + 1);
            result %= 45678;
        }
        System.out.println(result);
    }
}
