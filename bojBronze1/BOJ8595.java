package bojBronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BOJ8595 {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();
        br.readLine();
        long sum = 0;
        for (char ch : br.readLine().toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                sb.append(ch);
            } else {
                if (sb.length() > 0 && sb.length() <= 6) {
                    sum += Long.parseLong(sb.toString());
                }
                sb.setLength(0);
            }
        }

        if (sb.length() > 0 && sb.length() <= 6) {
            sum += Long.parseLong(sb.toString());
        }

        System.out.print(sum);
    }
}
