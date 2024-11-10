package bojBronze3;

import java.util.Scanner;

public class BOJ10707 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int P = sc.nextInt();
        int X = A * P;
        int Y = B + (P > C ? (P - C) * D : 0);
        System.out.println(Math.min(X, Y));
    }
}
