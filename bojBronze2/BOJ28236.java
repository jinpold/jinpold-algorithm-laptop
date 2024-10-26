package bojBronze2;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ28236 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        int min=100000000;
        int index=0;

        for(int i=1; i<=k; i++){
            st=new StringTokenizer(br.readLine());
            int tempn=Integer.parseInt(st.nextToken());
            int tempm=Integer.parseInt(st.nextToken());
            int temp=tempn-1+m-tempm;
            index= min>temp ? i : index;
            min= min>temp ? temp : min;
        }
        bw.write(index+"");
        bw.flush();

    }
}
