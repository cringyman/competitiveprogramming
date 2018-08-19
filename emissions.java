import java.util.*;
import java.lang.*;

public class emissions{
  public static void main(String[] args) {
  	Scanner in = new Scanner(System.in);
  	int n=in.nextInt();
  	int max=in.nextInt();
  	int[] arr = new int[n];
for (int i=0;i<n ;i++ ) {
	arr[i]=in.nextInt();
}
int maxi=0;
int ma=0;
int sum=0;
int i=0;
int j=0;


while(i<n&&j<n){
if(sum+arr[i]<=max){
	sum+=arr[i];
	i++;
	maxi++;
	ma=max(maxi,ma);
}

else{
	sum-=arr[j];
	maxi--;
   j++;
}

}  
 

 System.out.println(ma);
}
static int max(int a, int b){
	return (a>b?a:b);
}

  }
