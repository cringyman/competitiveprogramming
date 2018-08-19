package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AHamza {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t=in.nextInt();
        for (int i = 0; i < t; i++) {
            int n=in.nextInt();
            long []arr= new long[n];
            Set <Long> st= new HashSet<>();

            for (int j = 0; j <n ; j++) {
              long a=in.nextLong();
              arr[j]=a;
              st.add(a);
            }
            int max=-1;
            for (Iterator<Long> it = st.iterator(); it.hasNext(); ){
                long d=it.next();
                out.println(d);
                }
            }

        }
    }


