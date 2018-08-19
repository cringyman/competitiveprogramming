package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.StringTokenizer;

public class AMyFriendOfMisery {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int t = in.nextInt();

            int l = 0;
            int r = Integer.MAX_VALUE;
            int cost = 0;
            for (int j = 0; j < t; j++) {
                String s = in.readLine();
                String[] arr = s.split(" ");
                int p = Int(arr[0]) + 25;

                if (arr[1].equals("-")) {
                    r = Math.min(r, l + p - 1);
                } else  {
                    l += p;
                }

            }

            out.println(r - l + 1);
        }
    }

    static int Int(String s) {
        return Integer.parseInt(s);
    }

}

