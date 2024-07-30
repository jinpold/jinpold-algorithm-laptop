package bojBronze3;

import java.util.Scanner;

public class BOJ15953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int prize = 0;
            if (A == 1) prize += 5000000;
            else if (A > 1 && A < 4) prize += 3000000;
            else if (A > 3 && A < 7) prize += 2000000;
            else if (A > 6 && A < 11) prize += 500000;
            else if (A > 10 && A < 16) prize += 300000;
            else if (A > 15 && A < 22) prize += 100000;
            if (B == 1) prize += 5120000;
            else if (B > 1 && B < 4) prize += 2560000;
            else if (B > 3 && B < 8) prize += 1280000;
            else if (B > 7 && B < 16) prize += 640000;
            else if (B > 15 && B < 32) prize += 320000;
            System.out.println(prize);
        }
        sc.close();
    }
}
