package bojBronze2;

import java.io.*;

public class BOJ2920 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] arr = br.readLine().split(" ");
            int[] intArr = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                intArr[i] = Integer.parseInt(arr[i]);
            }
            if (intArr[0] == 1) {
                for (int i = 1; i < intArr.length; i++) {
                    if (intArr[i] != i + 1) {
                        System.out.println("mixed");
                        return;
                    }
                }
                System.out.println("ascending");
            } else if (intArr[0] == 8) {
                for (int i = 1; i < intArr.length; i++) {
                    if (intArr[i] != 8 - i) {
                        System.out.println("mixed");
                        return;
                    }
                }
                System.out.println("descending");
            } else {
                System.out.println("mixed");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
