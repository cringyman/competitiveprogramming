package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.HashMap;

public class AShaassAndOskols {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
       int n=in.nextInt();
      int []arr=new int[102];
        for (int i = 1; i <=n ; i++) {
            arr[i]=in.nextInt();
        }
        int m=in.nextInt();
        for (int i = 0; i < m; i++) {
            int idx=in.nextInt();
            int v=in.nextInt();
            arr[idx-1]+=v-1;
            arr[idx+1]+=arr[idx]-v;
            arr[idx]=0;
        }
        for (int i = 1; i <= n; i++) {
            out.println(arr[i]);
        }
    }
}
