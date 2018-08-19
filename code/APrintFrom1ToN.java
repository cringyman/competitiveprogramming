package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class APrintFrom1ToN {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt();
        solve(n);
        int[] arr = new int[n];
        Arrays.copyOfRange(arr,1,arr.length);
    }
    static void solve(int n){
        if(n==0){
            System.out.println(0);
            return;
        }
        System.out.println(n);
        solve(n-1);

    }
}
