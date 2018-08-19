package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AKRounding {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long n=in.nextLong();
        long k=in.nextLong();
   long a=1;
        for (int i = 0; i < k; i++) {
            a*=10;
        }


        out.println(lcm(a,n));

    }







    static long gcd(long a, long b){
        return (b==0)?a:gcd(b,a%b);
    }
    static long lcm(long a, long b){
        return  (a*b)/gcd(a,b);
    }
}
