package bojBronze3;

import java.util.Scanner;

public class BOJ10569 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int V = sc.nextInt();
            int E = sc.nextInt();
            System.out.println(2 - V + E);
        }
        sc.close();
    }
}
