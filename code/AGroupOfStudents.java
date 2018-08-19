package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class AGroupOfStudents {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt();
        int[] arr=in.nextIntArray(n);
        int x=in.nextInt();
        int y=in.nextInt();
        int sum=Arrays.stream(arr).sum();
        int sum1=0;

        for (int i = 0; i <n ; i++) {
            sum1+=arr[i];
            int sum2=sum-sum1;
            if(x<=sum1&&sum1<=y&&x<=sum2&&sum2<=y){
                out.println(i+2);
                return;
            }

        }
        out.println(0);
    }
}
