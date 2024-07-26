package jinPractice;

public class NumArr {
    public static void main(String[] args) {
        int[] numArr = new int[5];
        int result = 0;

        for(int i=0; i<5; i++)
            numArr[i] = ++i;

        for(int i : numArr)
            result += i;

        System.out.printf("%d", result);
    }
}
