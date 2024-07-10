package bojBronze3;

import java.util.Scanner;

public class BOJ10992 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<n; i++) {
            System.out.print(" ");
        }
        System.out.println('*');

        for (int i=2; i<n; i++) {
            for (int j=n-i; j>0; j--) {
                System.out.print(" ");
            }
            System.out.print('*');

            for (int j=1; j<=2*(i-1)-1; j++) {
                System.out.print(" ");
            }
            System.out.println('*');
        }
        if (n != 1) {
            for (int i=1; i<=2*n-1; i++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
