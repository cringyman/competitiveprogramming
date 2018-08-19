import java.util.*;
 
 public class TaskA{

public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
   int max=0;
      int n=in.nextInt();
      int[] arr = new int[n];
     
    for(int i=0;i<n;i++){
       arr[i]=in.nextInt();
    }

     for (int i=0;i<n ;i++ ) {
     	int c=0;
     	int j;
         for (j=i+1;j<n&&arr[j]>arr[j-1];j++ ){ 
              		c++;}
              	  
              	i=j-1;	
            max =Math.max(c,max);
           
         }

      System.out.println(max+1);
             }}
           
      
        


    
   






 