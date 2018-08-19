package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class APointsInSegments {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt();
        int m=in.nextInt();
        int count=0;
        boolean is[]= new boolean[m+1];
        for (int i = 0; i < n; i++) {
        int l=in.nextInt();
        int r=in.nextInt();
            for (int j = 1; j <= m; j++) {
                if(l<=j&&j<=r){
                    is[j]=true;

                }

            }

        }

        String s="";
        for (int i = 1; i <=m ; i++) {
            if(!is[i]){
                count++;
                s+=i+" ";           }
        }
        out.println(count);
        out.println(s);
    }
}
