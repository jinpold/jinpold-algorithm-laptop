package bojBronze3;

import java.util.Scanner;

public class BOJ2953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int max_num = 0;
        for(int i=1; i<=5; i++) {
            int temp_sum = 0;
            for(int j=0; j<4; j++) {
                temp_sum += sc.nextInt();
            }
            if(temp_sum > max) {
                max = temp_sum;
                max_num = i;
            }
        }
        System.out.println(max_num + " " + max);
    }
}
