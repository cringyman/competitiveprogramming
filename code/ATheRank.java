package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class ATheRank {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt();
        int[] sum=new int[n];
        for (int i = 0; i < n; i++) {
            int a=in.nextInt();
            int b=in.nextInt();
            int c=in.nextInt();
            int d=in.nextInt();
            sum[i]=a+b+c+d;
        }
        int win=sum[0];
        Arrays.sort(sum);
        int j=1;
        for (int i = n-1; i >= 0; i--){
            if(win==sum[i]){
                break;
            }
            j++;
        }
        out.println(j);
    }
}
