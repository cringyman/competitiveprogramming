package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class animaldrawer {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int[] arr = in.nextIntArray(6);
        Arrays.sort(arr);
        boolean animal=false;
        for (int i = 0; i < 3; i++) {
            if(arr[i]==arr[i+1]&&arr[i+1]==arr[i+2]&&arr[i+2]==arr[i+3]){
                animal=true;
                arr[i]=arr[i+1]=arr[i+2]=arr[i+3]=0;
                break;
            }
        }
        if(!animal){
            out.println("Alien");
            return;
        }
        Arrays.sort(arr);
    if(arr[4]==arr[5]){
        out.println("Elephant");
    }
    else{
        out.println("Bear");
    }
    }
}
