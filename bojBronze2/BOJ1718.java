package bojBronze2;

import java.util.Scanner;

public class BOJ1718 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String key = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        int keyLength = key.length();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == ' ') {
                sb.append(' ');
            } else {
                int diff = key.charAt(i % keyLength) - 'a' + 1;
                char newChar = (char) (c - diff);
                if (newChar < 'a') {
                    newChar += 26;
                }
                sb.append(newChar);
            }
        }
        System.out.println(sb);

    }
}
