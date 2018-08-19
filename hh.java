import java.util.*;
  public class Main{
     public static void main(String[] args) {
    	
    Scanner in= new Scanner (System.in);
    while(true){
    int n=in.nextInt();
    int m=in.nextInt();
    if(n==0&&m==0)break;
    if(n+m==13){
       System.out.println("Never speak again.");
    }
    else{


    if(n>m){
    	System.out.println("To the convention.");
    }
    else if(n<m){
    	System.out.println("Left beehind.");
    }
    else{
    	System.out.println("Undecided.");
    }
    }

}
    }



  }