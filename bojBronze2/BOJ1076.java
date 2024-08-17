package bojBronze2;

import java.util.Scanner;

public class BOJ1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        long result = 0;
        for (int i = 0; i < 3; i++) {
            String input = sc.next();
            for (int j = 0; j < color.length; j++) {
                if (input.equals(color[j])) {
                    if (i == 0) {
                        result += j * 10;
                    } else if (i == 1) {
                        result += j;
                    } else {
                        for (int k = 0; k < j; k++) {
                            result *= 10;
                        }
                    }
                }
            }
        }
        System.out.println(result);
    }
}
