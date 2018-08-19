package code;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.HashSet;
import java.util.Set;

public class AAntonAndLetters {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s=in.readLine();
        Set<Character> st= new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if(c!=' '&&c!='{'&&c!='}'&&c!=','){
                st.add(c);}
            }
            out.println(st.size());
        }

    }

