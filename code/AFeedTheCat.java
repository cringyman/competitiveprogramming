package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AFeedTheCat {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int hh=in.nextInt();
        int mm=in.nextInt();
        int h=in.nextInt();
        int d=in.nextInt();
        int c=in.nextInt();
        int n=in.nextInt();
        double time = ((19 - hh) * 60) + (60 - mm);
        if (hh >= 20) {
            out.println(hell(h,d,n,0) * (0.8)*c );
        } else {
            out.println(Math.min( (hell(h,d,n,time) * (0.8)*c),(hell(h,d,n,0)*c)  ) );
        }
    }
    static double hell(double h, double d, double n, double time) {
        if ((h + (time*d)) % n == 0) {
            return ((h + (time*d)) / n);
        } else {
            return (int)(((h + (time*d)) / n) + 1);
        }
}}
