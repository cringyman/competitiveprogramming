/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

        public class blind {
    public static void main(String[] args) throws FileNotFoundException{
        
        HashMap <Integer,String> hm=new HashMap<>();
        FileInputStream fis = new FileInputStream("scoreboard.in");
        Scanner sc =new Scanner(fis);
        String [] arr1;
        String[] arr2;
        String a;
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            sc.nextLine();
            String s1=sc.nextLine();
            String s2=sc.nextLine();
            arr1=s1.split(" ");
             arr2=s2.split(" ");
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
             if(arr1[i].equals(arr2[j])&&i==j){
                 a="team "+arr1[i]+" stayed at "+(i+1)+str(i+1)+"position";
             hm.put(Integer.parseInt(arr1[i]), a);
             }
             else if(arr1[i].equals(arr2[j])&&i!=j){
               a="team "+arr1[i]+" moved from "+(i+1)+str(i+1)+"position to "+(j+1)+str(j+1)+"position";
             hm.put(Integer.parseInt(arr1[i]), a);
             }
             
                }
            }
          for(int h=0;h<hm.size();h++){
              System.out.println(hm.get(1+h));
          }  
          hm.clear();
        }
    }
    public static String str(int a){
       int b=a%10;
              while(b>9){
                  b=b%10;
              }
        if(a==13||a==12||a==11){
            return "th";
        }
        else{
            switch(b){
                case 1:return "st ";
                case 2:return "nd ";
                case 3:return "rd ";
                        default: return "th ";
            }
        }
    }
}
