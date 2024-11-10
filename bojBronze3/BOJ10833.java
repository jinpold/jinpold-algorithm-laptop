package bojBronze3;

import java.util.Scanner;

public class BOJ10833 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            int students = sc.nextInt();
            int apples = sc.nextInt();
            sum += apples % students;
        }
        System.out.println(sum);
    }
}
