package bojBronze3;

import java.util.Scanner;

public class BOJ2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int cnt = 0;
        int result = 0;
        boolean flag = false;
        for(int i=1;i<=N;i++){
            if(N%i==0){
                cnt++;
                if(cnt==K){
                    flag = true;
                    result = i;
                    break;
                }
            }
        }
        if(flag) System.out.println(result);
        else System.out.println(0);
    }
}
