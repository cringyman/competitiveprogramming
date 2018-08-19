/* Use the slash-star style comments or the system won't see your
   identification information */
/*
ID: lotfiay2
LANG: JAVA
TASK: ride
*/
import java.io.*;
import java.util.*;

class ride {
  public static void main (String [] args) throws IOException {
    // Use BufferedReader rather than RandomAccessFile; it's much faster
    BufferedReader f = new BufferedReader(new FileReader("ride.in"));
                                                  // input file name goes above
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
    // Use StringTokenizer vs. readLine/split -- lots faster
   
						  // Get line, break into tokens
    String s1=f.readLine();
    String s2=f.readLine();
   
     if(getmod(s1)==getmod(s2)){
    out.println("GO");    }   
     else{
         out.println("STAY"); 
     }
     // output result
    out.close();                                  // close the output file
  }
static int getmod(String s1){
   int c=1;//store the multiplication in c
   for(int i=0;i<s1.length();i++){
  c*=(int)s1.charAt(i)-(int)'A' +1;}
    return c%47;
    
}


}