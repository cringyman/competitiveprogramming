import java.util.*;
public class colors{
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int t=in.nextInt();
	for (int i=0;i<t ;i++ ) {
		int n=in.nextInt();
		if(n==1){
			System.out.println("1");
		}
		else if(n==2){
			System.out.println("2 1");
		}
		else{
           System.out.print("2 1 2 ");
           for (int j=0;j<n-3 ;j++ ) {
           	System.out.print("1 ");
           }
           System.out.println();
		}
	}
}

}