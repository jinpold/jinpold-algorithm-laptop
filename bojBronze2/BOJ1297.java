package bojBronze2;

import java.util.Scanner;

public class BOJ1297 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int H = sc.nextInt();
        int W = sc.nextInt();
        double x = Math.sqrt((double) (D * D) / (H * H + W * W));
        System.out.println((int)(H * x) + " " + (int)(W * x));
    }
}
