import java.util.*;
import java.io.*;
public class grid{
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n=in.nextInt();
	int k=in.nextInt();
	boolean[] vis=new boolean[n];
   int[] arr= new int[n];
   for (int i=0;i<n;i++) {
   	arr[i]=in.nextInt();
   }
   //define boolena to check passed element
   //twopointers
   int i=0,j=0;
   int count=0;
   int checker=0;
   int min=n;
   while(i<n&&j<n){
    
    if(!vis[arr[i]]){
    checker++;
    vis[arr[i]]=true;
     if(checker==k){
      min=Math.min(min,i-j+1);
      checker--;

      j++;
     }
   i++;
   }
   
  



   }


	}
}
 





  


