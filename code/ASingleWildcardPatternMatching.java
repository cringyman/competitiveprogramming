package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ASingleWildcardPatternMatching {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt();
        int m=in.nextInt();

        String s=in.next();
        String st = in.next();
        int a=s.indexOf("*");

        if(m+1<n){
            out.println("NO");
          return;
        }
        if(a==-1){
            out.println((st.equals(s)?"YES":"NO"));
            return;
        }
        else{
            out.println((st.startsWith(s.substring(0,a))&&st.endsWith(s.substring(a+1,s.length())))?"YES":"NO");
        }

    }
}
