package bojBronze3;

import java.util.Scanner;

public class BOJ4054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (N != 0) {
            int sum = 0;
            for (int i = 0; i < N+1; i++) {
                for (int j = i; j < N+1; j++) {
                    sum += i + j;
                }
            }
            System.out.println(sum);
            N = sc.nextInt();
        }
        sc.close();
    }
}
