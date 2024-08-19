package bojBronze2;

import java.util.Scanner;

public class BOJ1100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        for (int i = 0; i < 8; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0 && str.charAt(j) == 'F') {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
