package bojBronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class BOJ3985 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int L = Integer.parseInt(br.readLine());
        boolean[] cake = new boolean[L];

        int N = Integer.parseInt(br.readLine());
        int[] P = new int[N];
        int[] K = new int[N];

        int pre_Max_Value = Integer.MIN_VALUE;
        int pre_Max_Idx = 0;
        int real_Max_Value = Integer.MIN_VALUE;
        int real_Max_Idx = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            P[i] = Integer.parseInt(st.nextToken())-1;
            K[i] = Integer.parseInt(st.nextToken())-1;

            if(pre_Max_Value < (K[i] - P[i] + 1)) {
                pre_Max_Value = K[i] - P[i] + 1;
                pre_Max_Idx = i;
            }
            int count = 0;
            for (int j = P[i]; j <= K[i]; j++) {

                if(cake[j] == false) {
                    cake[j] = true;
                    count++;
                }
            }

            if(count > real_Max_Value) {
                real_Max_Value = count;
                real_Max_Idx = i;
            }
        }

        System.out.println(pre_Max_Idx+1);
        System.out.println(real_Max_Idx+1);
        br.close();
    }
}


