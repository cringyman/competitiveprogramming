package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class APizzaPizzaPizza {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long n=in.nextLong();
       if(n!=0){
        if((n+1)%2==0)out.println((n+1)/2);
        else{
            out.println(n+1);
        }}
        else{
           out.println(0);
       }
    }
}
