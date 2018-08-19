package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ACodehorsesTShirts {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt();
        String[] arr=new String[n];
        String[]ar=new String [n];
        for (int i = 0; i < n; i++) {

        arr[i]=in.next();}
        for (int i = 0; i < n; i++) {

            ar[i]=in.next();}
       int ans=0;
        for (int j = 0; j <n ; j++) {
            for (int k = 0; k <n ; k++) {
                if(arr[k].equals(ar[j])){
                    arr[k]="a";
                    ar[j]="s";
                    ans++;
                }
            }
        }
        out.println(n-ans);
    }
}
