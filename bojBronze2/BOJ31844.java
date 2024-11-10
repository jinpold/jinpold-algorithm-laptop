package bojBronze2;

import java.io.*;

public class BOJ31844{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] arr = br.readLine().toCharArray();

        int robot = 0;
        int box = 0;
        int goal = 0;

        for (int i = 0; i < 10; i++) {
            if (arr[i] == '@') {
                robot = i;
            } else if (arr[i] == '#') {
                box = i;
            } else if (arr[i] == '!') {
                goal = i;
            }
        }

        int count = 0;
        if (robot < box && goal < box) {
            count = -1;
        } else if (robot > box && goal > box) {
            count = -1;
        } else {
            count = Math.abs(robot - goal) - 1;
        }

        bw.write(Integer.toString(count));
        bw.flush();
        bw.close();
        br.close();
    }
}
