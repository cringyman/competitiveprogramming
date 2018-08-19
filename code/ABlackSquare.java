package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ABlackSquare {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int a1=in.nextInt(), a2=in.nextInt(), a3=in.nextInt(), a4=in.nextInt();
       String s=in.next();
       int count1=0,count2=0,count3=0,count4=0;
        for (int i = 0; i <s.length(); i++) {

            if(s.charAt(i)=='1'){
              count1++;
            }
            if(s.charAt(i)=='2'){
                count2++;
            }
            if(s.charAt(i)=='3'){
                count3++;
            }
            if(s.charAt(i)=='4'){
                count4++;
            }
        }
        out.println(count1*a1+count2*a2+count3*a3+count4*a4);
    }
}
