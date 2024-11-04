package bojBronze1;

import java.io.*;
import java.util.*;

public class BOJ1357 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder str = new StringBuilder();

        str.append(Integer.parseInt(new StringBuffer(Integer.parseInt(new StringBuffer(st.nextToken()).reverse().toString()) + Integer.parseInt(new StringBuffer(st.nextToken()).reverse().toString())+"").reverse().toString()));

        System.out.print(str);
        br.close();
    }
}

