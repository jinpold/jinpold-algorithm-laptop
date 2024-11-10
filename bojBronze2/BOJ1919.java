package bojBronze2;

import java.util.Scanner;

public class BOJ1919 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int[] arrA = new int[26];
        int[] arrB = new int[26];
        int result = 0;
        for (int i = 0; i < A.length(); i++) {
            arrA[A.charAt(i) - 'a']++;
        }
        for (int i = 0; i < B.length(); i++) {
            arrB[B.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            result += Math.abs(arrA[i] - arrB[i]);
        }
        System.out.println(result);
    }
}
