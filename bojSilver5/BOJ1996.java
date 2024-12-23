package bojSilver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1996 {

    static int[] dy = {-1,0,1,1,1,0,-1,-1};
    static int[] dx = {-1,-1,-1,0,1,1,1,0};
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        char[][] cArr = new char[N][N];


        for(int i = 0; i < cArr.length; i++) {
            cArr[i] = br.readLine().toCharArray();
        }

        int[][] answer = new int[N][N];

        for(int i = 0; i < cArr.length; i++) {
            for(int j = 0; j < cArr.length; j++) {
                if('.' != cArr[i][j]) {
                    answer[i][j] = Integer.MIN_VALUE;
                    solution(i,j,cArr[i][j] - '0',cArr,answer);
                }
            }
        }
        draw(answer);
    }

    public static void solution(int x, int y, int bomb, char[][] cArr, int[][] answer ) {
        int maxLen = answer.length;
        for(int n = 0; n < 8; n++) {
            int nx = x + dx[n];
            int ny = y + dy[n];

            if(nx >= 0 && nx < maxLen && ny >= 0 && ny < maxLen) {
                answer[nx][ny] += bomb;
            }
        }
    }

    public static void draw(int[][] answer) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < answer.length; i++) {
            for(int j = 0; j < answer.length; j++) {
                if(answer[i][j] < 0) {
                    sb.append('*');
                } else if(answer[i][j] > 9) {
                    sb.append('M');
                } else {
                    sb.append(answer[i][j]);
                }
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}