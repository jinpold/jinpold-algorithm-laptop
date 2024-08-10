package bojBronze3;

import java.util.Scanner;

public class BOJ1284 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String N = sc.next();
            if (N.equals("0")) {
                break;
            }
            int sum = 2;
            for (int i = 0; i < N.length(); i++) {
                if (N.charAt(i) == '1') {
                    sum += 2;
                } else if (N.charAt(i) == '0') {
                    sum += 4;
                } else {
                    sum += 3;
                }
            }
            System.out.println(sum + N.length() - 1);
        }
        sc.close();
    }
}
