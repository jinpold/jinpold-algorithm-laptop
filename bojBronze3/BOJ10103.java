package bojBronze3;

import java.util.Scanner;

public class BOJ10103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int CY = 100;
        int SD = 100;
        for (int i = 0; i < N; i++) {
            int CYThrow = sc.nextInt();
            int SDThrow = sc.nextInt();
            if (CYThrow > SDThrow) {
                SD -= CYThrow;
            } else if (CYThrow < SDThrow) {
                CY -= SDThrow;
            }
        }
        System.out.println(CY);
        System.out.println(SD);
    }
}
