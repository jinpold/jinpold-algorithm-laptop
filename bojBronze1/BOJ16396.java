package bojBronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ16396 {
    public static void main(String[] args) throws IOException {
        int n[] = new int[10002];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for(int j = x; j < y; j++) {
                n[j] = 1;
            }
        }
        int sum = 0;
        for(int i = 0; i < 10001; i++){
            if(n[i] == 1) sum++;
        }
        System.out.println(sum);
    }
}
