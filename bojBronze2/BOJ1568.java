package bojBronze2;

import java.util.Scanner;

public class BOJ1568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;
        int time = 0;
        while (N > 0) {
            time++;
            if (N < time) {
                time = 1;
            }
            N -= time;
            result++;
        }
        System.out.println(result);
    }
}
