package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ABearAndBigBrother {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int a=in.nextInt(),b=in.nextInt();
        int i=0;
        while(a<=b){
          a*=3;
          b*=2;
          i++;
        }
        out.println(i);
    }
}
