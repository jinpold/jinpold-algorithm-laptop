package bojBronze3;

import java.util.Scanner;

public class BOJ2490 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int cnt = 0;
            for (int j = 0; j < 4; j++) {
                int temp = sc.nextInt();
                if(temp == 0) cnt++;
            }
            switch (cnt) {
                case 0:
                    System.out.println("E");
                    break;
                case 1:
                    System.out.println("A");
                    break;
                case 2:
                    System.out.println("B");
                    break;
                case 3:
                    System.out.println("C");
                    break;
                case 4:
                    System.out.println("D");
                    break;
            }
        }

    }
}
