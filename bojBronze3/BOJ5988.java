package bojBronze3;

import java.util.Scanner;

public class BOJ5988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            String str = sc.next();
            if (str.charAt(str.length()-1) % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
        sc.close();
    }
}
