package bojBronze3;

import java.util.Scanner;

public class BOJ9610 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q1 = 0;
        int Q2 = 0;
        int Q3 = 0;
        int Q4 = 0;
        int AXIS = 0;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x == 0 || y == 0) {
                AXIS++;
            } else if (x > 0 && y > 0) {
                Q1++;
            } else if (x < 0 && y > 0) {
                Q2++;
            } else if (x < 0 && y < 0) {
                Q3++;
            } else if (x > 0 && y < 0) {
                Q4++;
            }
        }
        System.out.println("Q1: " + Q1);
        System.out.println("Q2: " + Q2);
        System.out.println("Q3: " + Q3);
        System.out.println("Q4: " + Q4);
        System.out.println("AXIS: " + AXIS);
    }
}
