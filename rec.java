import java.util.*;
public class rec{
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n=in.nextInt();
	int k=in.nextInt();
    System.out.print(combin(n,k));
}
static  int combin(int n , int k){
int[][] nCk= new int[n+1][k+1];

	 if(n==k){
      return 1;

	 }

	 for (int j=n;j>=0;j-- ) {
	 	nCk[j][0]=1;
	 	nCk[j][1]=j;
	 }
	 
	
        for (int j=1;j<=n;j++) {
       for (int i=2;i<=k;i++) {
                
    	nCk[j][i]=nCk[j-1][i]+nCk[j][i-1];
   }}

	return nCk[n][k];
}




}