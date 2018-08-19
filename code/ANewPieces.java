package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ANewPieces {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
    int n=in.nextInt();

        for (int i = 0; i < n; i++) {
            long ans=0;
            long a=in.nextLong(),b=in.nextLong();
                ans=Math.max((b+1)/2*a,(a+1)/2*b);
            out.println(ans);
        }
    }
}
