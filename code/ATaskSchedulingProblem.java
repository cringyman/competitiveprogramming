package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class ATaskSchedulingProblem {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
    int[] arr=new int[3];
        for (int i = 0; i < 3; i++) {

            arr[i]=in.nextInt();
        }
        Arrays.sort(arr);
        int cost=arr[2]-arr[0];
        out.println(cost);
    }
}
