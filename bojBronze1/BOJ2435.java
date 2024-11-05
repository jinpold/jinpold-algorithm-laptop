package bojBronze1;

import java.util.Scanner;

public class BOJ2435 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int[] temp=new int[103];
        int n,k,max=Integer.MIN_VALUE;


        n=sc.nextInt();
        k=sc.nextInt();


        for(int i=0;i<n;i++)
            temp[i]=sc.nextInt();

        for(int i=0;i<=n-k;i++) {
            int sum=0;

            for(int j=0;j<k;j++)
                sum+=temp[i+j];

            if(sum>max)
                max=sum;
        }
        System.out.println(max);
    }

}
