package bojBronze3;

import java.util.Scanner;

public class BOJ4504 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (true) {
            int input = sc.nextInt();
            if (input == 0) break;
            if (input % N == 0) {
                System.out.println(input + " is a multiple of " + N + ".");
            } else {
                System.out.println(input + " is NOT a multiple of " + N + ".");
            }
        }
        sc.close();
    }
}
