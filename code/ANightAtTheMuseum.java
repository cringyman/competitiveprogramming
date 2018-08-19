package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ANightAtTheMuseum {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s=in.next();
        char c='a';

        int ans=0;
        for (int i = 0; i <s.length(); i++) {
            char a=s.charAt(i);
            int diff=Math.abs(a-c);
            c=a;
            ans+=Math.min(diff,26-diff);
        }
        out.println(ans);
    }
}
