

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
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
public class wifi {
    public static void main(String[] args) throws FileNotFoundException{
    ArrayList <Integer> arr=new ArrayList<>();
        FileInputStream fis = new FileInputStream("wifi.in");
        Scanner sc =new Scanner(fis);
          int t=sc.nextInt();
          
          
        while(t-->0){
             int count=0;
             int c=0;
    int t1=sc.nextInt();
    int o=sc.nextInt();
    while(t1-->0){
        int a=sc.nextInt();
        
            arr.add(a);
        
    }
    
    for(int i=0;i<arr.size();i++){
    if((c|arr.get(i))<=o){
             c|=arr.get(i);
             count++;
         }
    else{
        count=0;
    }}
    System.out.println(count);
    arr.clear();
}
  
}}
