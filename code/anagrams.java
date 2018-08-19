package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class anagrams {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt();
        for (int i = 0; i <n; i++) {
            String s=in.next();
            char[]arr=s.toCharArray();
            Arrays.sort(arr);
            out.print(arr.toString());
        }
    }
}
