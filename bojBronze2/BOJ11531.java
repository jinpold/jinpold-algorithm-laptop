package bojBronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class BOJ11531 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String[]> map = new HashMap<>();

        int correctNum = 0;
        int totalTime = 0;
        while (true) {
            String val = br.readLine();
            if (val.equals("-1")) { // 결산
                Set<String> keySet = map.keySet();
                Iterator<String> iter = keySet.iterator();
                while (iter.hasNext()) {
                    String key = iter.next();
                    String[] fin = map.get(key);
                    if (fin[1].equals("right")) {
                        correctNum++;
                        if (fin[2] != null) {
                            totalTime += Integer.parseInt(fin[0]) + (Integer.parseInt(fin[2]) * 20);
                        } else {
                            totalTime += Integer.parseInt(fin[0]);
                        }
                    }
                }
                break;
            } else {
                String[] arr = val.split(" ");
                String[] score = new String[3];
                score[0] = arr[0]; // 시간
                score[1] = arr[2]; // 맞틀
                int temp = 0;
                if (arr[2].equals("wrong")) {
                    temp = 1;
                }
                String[] current = map.get(arr[1]);
                if (current == null) {
                    score[2] = String.valueOf(temp);
                } else {
                    score[2] = String.valueOf(Integer.parseInt(current[2]) + temp);
                }
                map.put(arr[1], score);
            }
        }

        System.out.println(correctNum + " " + totalTime);

    }
}
