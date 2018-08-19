package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ADeathNote {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt();
        int m=in.nextInt();
        int re=0;
        int ans=0;
        int [] arr =in.nextIntArray(n);
        for (int i = 0; i < n-1; i++) {
            re=arr[i]%m;
            arr[i+1]=arr[i+1]+re;
        }
        for (int i = 0; i <n ; i++) {
            out.print((arr[i]/m)+" ");
        }
    }
    }

