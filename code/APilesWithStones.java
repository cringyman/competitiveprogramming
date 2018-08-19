package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class APilesWithStones {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt();
        int[] arr1=in.nextIntArray(n);
        int[] arr2=in.nextIntArray(n);
        int sum1=Arrays.stream(arr1).sum();
        int sum2=Arrays.stream(arr2).sum();
if(sum2>sum1){
    out.println("No");

}
else{
    out.println("Yes");
}
    }}
