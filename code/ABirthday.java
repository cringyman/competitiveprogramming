package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class ABirthday {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt();
        int m=in.nextInt();
        int[] arr=in.nextIntArray(n);
        Arrays.sort(arr);
        int count=0;
        for (int i = 0; i < n; i++) {
            if(m>=arr[i]){
                m-=arr[i];
                count++;
            }
            else{
                break;
            }
        }
        out.println(count);
    }
}
