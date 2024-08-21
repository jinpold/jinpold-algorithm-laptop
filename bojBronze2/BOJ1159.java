package bojBronze2;

import java.util.Scanner;

public class BOJ1159 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] alphabet = new int[26];
        for (int i = 0; i < N; i++) {
            String name = sc.next();
            alphabet[name.charAt(0) - 'a']++;
        }
        boolean check = false;
        for (int i = 0; i < 26; i++) {
            if (alphabet[i] >= 5) {
                System.out.print((char) (i + 'a'));
                check = true;
            }
        }
        if (!check) {
            System.out.println("PREDAJA");
        }
        sc.close();
    }
}
