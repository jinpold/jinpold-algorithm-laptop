package bojBronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ29332 {
    static final int INF  = Integer.MAX_VALUE/2;
    static int L = INF;
    static int R = -INF;
    static int U = -INF;
    static int D = INF;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while(n-- >0) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            char cmd = st.nextToken().charAt(0);
            switch (cmd) {
                case 'L': {
                    L = Math.min(L,x);
                    break;
                }
                case 'R': {
                    R = Math.max(R,x);
                    break;
                }
                case 'U': {
                    U = Math.max(U,y);
                }
                case 'D': {
                    D = Math.min(D,y);
                    break;
                }
            }
        }

        if(L == INF || R == -INF || U == -INF || D == INF) {
            System.out.println("Infinity");
        }else {

            long w = L - R -1;
            long h = D - U - 1;
            System.out.println(w*h);
        }
        br.close();
    }
}
