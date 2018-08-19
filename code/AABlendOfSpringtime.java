package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AABlendOfSpringtime {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s=in.next();
        if(check(s)){
            out.println("Yes");
        }
        else out.println("No");

    }
    static  boolean check(String s){
        if(s.contains("ABC")||s.contains("ACB")||s.contains("BAC")||s.contains("BCA")||s.contains("CAB")||s.contains("CBA")){
            return  true;
        }
     return false;
    }
}
