package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AAdjacentReplacements {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            int a=in.nextInt();
            if(a%2==1){
                arr[i]=a;
            }
            else{
                arr[i]=a-1;

            }
        }
        for (int i = 0; i < n; i++) {
            out.print(arr[i]+" ");
        }
    }
}
