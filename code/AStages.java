package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class AStages {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt();
        int k=in.nextInt();
        String s=in.next();
        char[]arr=s.toCharArray();
        Arrays.sort(arr);
        String sp=new String(arr);
        out.print(sp);

    int i=0;
    int count=0;
    char temp=sp.charAt(0);
    count+=(char)(Character.getNumericValue(temp))+1;
    k--;
    while(k>0&&i<sp.length()-1){
        i++;
        if(sp.charAt(i)>temp+1){
            temp=sp.charAt(i);
            count+=(char)(Character.getNumericValue(temp))+1;
            k--;
        }
    }
   if(k!=0){
        out.println(count);
   }
   else{
        out.println(-1);
   }
    }}
