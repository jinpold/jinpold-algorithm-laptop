package bojBronze2;

import java.util.Scanner;

public class BOJ1864 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.next();
            if (s.equals("#")) {
                break;
            }
            int result = 0;
            int len = s.length();
            for (int i = 0; i < len; i++) {
                char c = s.charAt(i);
                int num = 0;
                switch (c) {
                    case '-':
                        num = 0;
                        break;
                    case '\\':
                        num = 1;
                        break;
                    case '(':
                        num = 2;
                        break;
                    case '@':
                        num = 3;
                        break;
                    case '?':
                        num = 4;
                        break;
                    case '>':
                        num = 5;
                        break;
                    case '&':
                        num = 6;
                        break;
                    case '%':
                        num = 7;
                        break;
                    case '/':
                        num = -1;
                        break;
                }
                result += num * Math.pow(8, len - i - 1);
            }
            System.out.println(result);
        }
    }
}
