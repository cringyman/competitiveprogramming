package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class ACoder {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt();
        char[][] arr= new char[n][n];
        int[] movesi= new int[]{1,-1,0,0};
        int[] movesj= new int[]{0,0,1,-1};
        Arrays.fill(arr[n],'*');
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j]!='.'&&arr[i][j]!='C'){
                }
            }
        }
    }
}
