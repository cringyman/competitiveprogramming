package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AFreeIceCream {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt();
        int x=in.nextInt();
        long solde=x;
        long k=0;
        for (int i = 0; i < n; i++) {
            char c=in.next().charAt(0);
            int p=in.nextInt();
            if(c=='+'){
                solde+=p;
            }
            else{
                if(solde>=p){
                    solde-=p;
                }
                else{
                    k++;
                }
            }
        }
        out.println(solde+" "+k);
    }
}
