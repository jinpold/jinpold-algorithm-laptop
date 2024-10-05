package bojBronze2;

import java.util.Scanner;

public class BOJ2789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String[] cambridge = {"C", "A", "M", "B", "R", "I", "D", "G", "E"};
        for (int i = 0; i < cambridge.length; i++) {
            word = word.replace(cambridge[i], "");
        }
        System.out.println(word);
    }
}
