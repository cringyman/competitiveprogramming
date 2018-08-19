package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AAntonAndDanik {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
       int n=in.nextInt();
        String s=in.next();
        int a=0;
        int d=0;
        for (int i = 0; i <s.length(); i++) {
            if(s.charAt(i)=='A')a++;
            else{
                d++;
            }
        }
        if(a==d)out.println("Friendship");
        else if(a>d)out.println("Anton");
        else{
            out.println("Danik");
        }
    }
}
