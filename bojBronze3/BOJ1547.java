package bojBronze3;

import java.util.Scanner;

public class BOJ1547 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int[] cups = {0, 1, 2, 3};
        for (int i = 0; i < M; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int temp = cups[X];
            cups[X] = cups[Y];
            cups[Y] = temp;
        }
        for (int i = 1; i < cups.length; i++) {
            if (cups[i] == 1) {
                System.out.println(i);
                break;
            }
        }
    }
}
