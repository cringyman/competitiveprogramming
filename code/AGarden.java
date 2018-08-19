package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AGarden {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int a=in.nextInt();
        int b=in.nextInt();
        out.println(a*b-a-b+1);
    }
}
