package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ACombinationLock {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt();
        String locked=in.next();
        String unlocked=in.next();
        int a=0;

        for (int i = 0; i <n ; i++) {


            int modl =locked.charAt(i)-'0' ;
            int modu =unlocked.charAt(i)-'0' ;
            a += optimize(modl, modu);
        }
        out.println(a);
        }


    static int optimize(int a, int b){
        return Math.min(Math.abs(a-b),10-Math.abs(a-b));
    }}

