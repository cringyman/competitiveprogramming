package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AEvenOdds {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
    long n=in.nextLong();
    long  k=in.nextLong();
        long a = n/2 + n % 2;
        if ( k > a ) {
            out.println(2*(k-a));
        } else {
            out.println(2*k - 1);
        }
    }

}
