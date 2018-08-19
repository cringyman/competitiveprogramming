package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s=in.next();
        if(s.charAt(0)!='A'){
            out.println("WA");
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if(Character.isUpperCase(c)&&c!='C'&&c!='A'){
                out.println("WA");
                return;
            }
        }

        int count=0;
        for (int i = 2; i <s.length()-1 ; i++) {
            if(s.charAt(i)=='C')count++;
        }
        if(count!=1){
            out.println("WA");
            return;
        }
        out.println("AC");
    }
}
