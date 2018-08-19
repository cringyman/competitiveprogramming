package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class usacogreedy {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt();
        HashMap<String,Integer> hm= new HashMap<>();
        String [] arr= new String[n];
        for (int i = 0; i < n; i++) {
            arr[i]=in.next();
            hm.put(arr[i],0);
        }
        for (int i = 0; i < n; i++) {
            String s=in.next();

            int money=in.nextInt(), p=in.nextInt();
            int pt=hm.get(s);

          hm.put(s,pt+(p!=0?(money%p):0)-(p!=0?money:0));
            for (int j = 0; j <p; j++) {
                String per=in.next();
                int prev=hm.get(per);
                hm.put(per,prev+(money/p));
            }

        }
         for(String ar:arr)
         out.println(ar+" "+hm.get(ar));
    }
}
