package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ATrickySum {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t=in.nextInt();
        for (int i = 0; i < t; i++) {
            long n=in.nextInt();
        long sum=(n*(n+1))/2;
        long sumofpower= (long) Math.pow(2,log(n,2)+1)-1;
      out.println(sum-2*sumofpower);
        }
    }
    static int log(long x, int base)
    {
        return (int) (Math.log(x) / Math.log(base));
    }
}
