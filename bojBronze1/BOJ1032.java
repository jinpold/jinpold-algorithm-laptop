package bojBronze1;

import java.util.Scanner;

public class BOJ1032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.next();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr[0].length(); i++) {
            char c = arr[0].charAt(i);
            boolean isSame = true;
            for (int j = 1; j < N; j++) {
                if (c != arr[j].charAt(i)) {
                    isSame = false;
                    break;
                }
            }
            if (isSame) {
                sb.append(c);
            } else {
                sb.append("?");
            }
        }
        System.out.println(sb);
    }
}
