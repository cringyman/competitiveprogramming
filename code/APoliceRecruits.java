package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class APoliceRecruits {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt();

        int r=0;
        int l=0;
        int sum=0;
        int ans=0;
        for (int i = 0; i < n; i++) {
            int a=in.nextInt();
            if(a!=-1){
                sum+=a;
            }
            else{
                if(sum>0){
                    sum+=a;
                }
                else{
                  ans++;
                }
            }
        }
   out.println(ans);
    }
}
