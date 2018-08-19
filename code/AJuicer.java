package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AJuicer {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt();
        int b=in.nextInt();
        int d=in.nextInt();
        long count=0;
        int y=0;
        for (int i = 0; i < n; i++) {
            int a=in.nextInt();
            if(a<=b)count+=a;

        if(count>d){
            y++;
            count=0;
        }}
  out.println(y);
}}
