package bojBronze2;

import java.io.*;
import java.util.*;


public class BOJ31866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if (a == 0) {
            if (b == 5) {
                sb.append("<");
            } else if (b == 0) {
                sb.append("=");
            } else {
                sb.append(">");
            }

        } else if (a == 2) {
            if (b == 0) {
                sb.append("<");
            } else if (b == 2) {
                sb.append("=");
            } else {
                sb.append(">");
            }

        } else if (a == 5) {
            if (b == 2) {
                sb.append("<");
            } else if (b == 5) {
                sb.append("=");
            } else {
                sb.append(">");
            }

        } else {
            if (b == 0 || b == 2 || b == 5) {
                sb.append("<");
            } else {
                sb.append("=");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
