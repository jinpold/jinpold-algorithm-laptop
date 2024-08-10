package bojBronze3;

import java.util.Scanner;

public class BOJ4458 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();
            if (str.charAt(0) >= 97 && str.charAt(0) <= 122) {
                System.out.println((char)(str.charAt(0) - 32) + str.substring(1));
            } else {
                System.out.println(str);
            }
        }
        sc.close();
    }
}
