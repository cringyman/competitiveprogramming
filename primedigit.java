import java.util.Scanner;
  class Main{
   public static void main(String[] args){
       Scanner in = new Scanner(System.in);
                long n=in.nextLong();
     
         if(n%2==0){
          System.out.println(n/2);

         }
         else{
         	System.out.print(((n-1)/2)-n);
         }

      


   }



  }