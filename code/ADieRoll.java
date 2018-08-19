package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.math.BigInteger;

public class ADieRoll {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int y=in.nextInt(),w=in.nextInt();
        int res=7-Math.max(y,w);
        out.println(res/gcd(res,6)+"/"+6/gcd(res,6));
    }
     static int gcd(int a, int b) {
        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        BigInteger gcd = b1.gcd(b2);
        return gcd.intValue();
    }
}
