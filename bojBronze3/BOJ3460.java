package bojBronze3;

import java.util.Scanner;

public class BOJ3460 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            String Binary = Integer.toBinaryString(n);
            for(int j=Binary.length()-1; j>=0; j--) {
                if(Binary.charAt(j)=='1') {
                    System.out.print(Binary.length()-j-1+" ");
                }
            }
        }

    }

}