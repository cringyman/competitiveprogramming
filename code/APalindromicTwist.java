package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class APalindromicTwist {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t=in.nextInt();

        for (int i = 0; i < t; i++) {
          int n=in.nextInt();
            String s = in.next();
            int j=0;
            int z=n-1;
              boolean fin=true;
            while(j<n&&z>=0){
                boolean check=false;
                char a=s.charAt(j);
                char b=s.charAt(z);
                bel:{for (int k = -1; k <=1&&k!=0 ; k++) {
                    char c=(char) ((int)a+k);
                    for (int l = -1; l <=1&&l!=0 ; l++) {
                        char d=(char)((int)b+l);
                        if(d==c){
                            check=true;
                            break bel;
                        }
                    }}

                }
                fin&=check;


                j++;
                z--;
            }
            if(fin)
      out.println("YES");
            else out.println("NO");
        }



    }


}
