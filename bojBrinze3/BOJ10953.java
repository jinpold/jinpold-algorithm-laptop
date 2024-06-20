package bojBrinze3;

import java.util.Scanner;

public class BOJ10953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < N; i++) {
            String[] text = sc.next().split(",");
            int A = Integer.parseInt(text[0]);
            int B = Integer.parseInt(text[1]);
            System.out.println(Integer.parseInt(text[0]) + Integer.parseInt(text[1]));
        }
    }
}
