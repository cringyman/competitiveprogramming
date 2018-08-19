import java.util.*;
public class gcd{

public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n=in.nextInt();
	if(n<0)n=-n;
	int m=in.nextInt();
	if(m<0)m=-m;
	System.out.println(gcd(n,m));
}
static int gcd(int a, int b){
      if(b==0){
      	return a;
      }
	return gcd(b,a%b);
}

}