package bojBronze2;

import java.util.Scanner;

public class BOJ2711 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int index = sc.nextInt();
            String word = sc.next();
            System.out.println(word.substring(0, index - 1) + word.substring(index));
        }
    }
}