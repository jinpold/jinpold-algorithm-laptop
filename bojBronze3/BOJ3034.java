package bojBronze3;

import java.util.Scanner;

public class BOJ3034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int H = sc.nextInt();
        double diagonal = Math.sqrt(W*W + H*H);
        for (int i = 0; i < N; i++) {
            if (sc.nextInt() <= diagonal) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }
        sc.close();
    }
}
