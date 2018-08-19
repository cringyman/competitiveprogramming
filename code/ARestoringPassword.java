package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ARestoringPassword {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s=in.next();
        String [] st = new String[10];
        for (int i = 0; i <= 9; i++) {
            st[i]=in.next();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <=70; i+=10) {
            String t=s.substring(i,i+10);
            for (int j = 0; j <= 9; j++) {
                if(t.equals(st[j])){
                    sb.append(j);
                }
            }
        }
        out.println(sb.toString());
    }
}
