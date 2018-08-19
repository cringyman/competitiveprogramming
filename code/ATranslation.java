package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ATranslation {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s=in.next();
        String st=in.next();
        if(s.equals(new StringBuilder(st).reverse().toString())){
            out.println("YES");
        }
        else {
            out.println("NO");
        }
    }
}
