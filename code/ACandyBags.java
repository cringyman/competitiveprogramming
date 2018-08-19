package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ACandyBags {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt();
        for (int i = 0; i < (n*n)/2; i++) {
            out.println((i+1)+" "+(n*n-i));
        }
    }
}
