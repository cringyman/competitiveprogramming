
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lotfi
 */
public class tabs {
       public static void main(String[] args) throws FileNotFoundException {
         int count=0;
           FileInputStream fis = new FileInputStream("tabs.in");
        Scanner sc =new Scanner(fis);
          int t=sc.nextInt();
         while(t-->0){
             int a=sc.nextInt();
             int b=sc.nextInt();
             if(b==a||b==1){
                 count=1;
             }
             else{
                 count=2;
             }
             System.out.println(count);
         }
    
}}
