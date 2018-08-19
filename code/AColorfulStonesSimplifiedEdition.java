package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AColorfulStonesSimplifiedEdition {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
    String s=in.next();
    String t=in.next();
    int ans=0;
    for(int i=0;i<t.length();i++){
       if(s.charAt(ans)==t.charAt(i))ans++;
    }
    out.println(ans+1);
    }
}
