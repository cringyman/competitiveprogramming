package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AUnimodalArray {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
   int n=in.nextInt();

    //case 1 and 2
   int [] arr=in.nextIntArray(n);
      int inc=0;
      int decr=n-1;

     while(inc<n-1&&arr[inc+1]>arr[inc]){
         inc++;
     }
     while (decr>=1&&arr[decr-1]>arr[decr]){
         decr--;
     }
        for (int i = inc+1; i <=decr ; i++) {
            if(arr[inc]!=arr[i+1]){
                out.println("YES");
                return;
            }

        }
         out.println("NO");

    }
}
