package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AReconnaissance2 {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt();
        int[]arr=in.nextIntArray(n);
        int min=Integer.MAX_VALUE;
        int ans1=-1;
        int ans2=-1;
        for (int i = 0; i <n ; i++) {

                    if(Math.abs(arr[i]-arr[(i+1)%n])<=min){
                      min=Math.abs(arr[i]-arr[(i+1)%n]);
                        ans1=i;
                     ans2=(i+1)%n;
                    }
                }


        ans1++;
        ans2++;
        out.println(ans1+" "+ans2);
    }

}
