package bojBronze1;

import java.util.Scanner;

public class BOJ1110 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int start = N;
        sc.close();

        int count = 0;

        while(true) {
            N = (N%10*10)+((N/10+N%10)%10);
            count ++;
            if(start == N) {
                break;
            }
        }
        System.out.print(count);
    }
}
