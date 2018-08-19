package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AGames {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt();
        int[] host=new int[n];
        int[] guest = new int[n];
        int count=0;
        for (int i = 0; i < n; i++) {
            host[i]=in.nextInt();
            guest[i]=in.nextInt();

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(host[i]==guest[j]){
                    count++;
                }
            }
        }
        out.println(count);
    }
}
