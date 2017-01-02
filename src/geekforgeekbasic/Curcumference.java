package geekforgeekbasic;

import java.util.Scanner;

public class Curcumference {
	public static int catalanDP(int n){
		int[] catalan = new int[n+1];
		catalan[0] = catalan[1]=1;
		for(int i=2;i<=n; i++){
			for(int j=0;j<i;j++)
		      catalan[i] +=catalan[j] * catalan[i-j-1];
		}
		return catalan[n];
		}

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 int loop = scanner.nextInt();
		// TODO Auto-generated method stub
		 for(int i=0; i< loop; i++){
			 int num = scanner.nextInt();
			 System.out.println(catalanDP(num/2));
		 }

	}

}
