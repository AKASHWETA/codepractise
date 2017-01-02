package geekforgeekbasic;

import java.util.Scanner;

/**
 * We know, LCM(a,b)=a*b/gcd(a,b);
 * The above relation only holds for two numbers,
		LCM(a,b,c) != a*b*c/gcd(a,b,c);
The idea here is to extend our relation for more than 2 numbers. Let’s say we have an array arr[] that contains n elements whose LCM needed to be calculated.
Solution
Initialize ans = arr[0].
Iterate over all the elements of the array i.e. from i = 1 to i = n-1
At the ith iteration ans = LCM(arr[0], arr[1], …….., arr[i-1]). This can be done easily as LCM(arr[0], arr[1], …., arr[i]) = LCM(ans, arr[i]). 
Thus at i’th iteration we just have to do ans = LCM(ans, arr[i]) = ans x arr[i] / gcd(ans, arr[i])

 * @author apalewar
 *
 */
public class LCMOfArray {
	
	public static int gcd(int a,int b){
		if(b==0){
			return a;
		}else{
			return	gcd(b,a%b);
		}
	}

	public static int findLcm(int[] arr){
		int ans =arr[0];
		for(int i=0; i< arr.length;i++){
			ans = ((arr[i] * ans)/(gcd(arr[i],ans)));
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numOfT = input.nextInt();
		int n = input.nextInt();
		int[] numbers = new int[n];
		for(int i=0; i<=numOfT; i++){
		    for (int j = 0; i < n; i++){	   
		           numbers[i] = input.nextInt();
		    }
		    System.out.println(findLcm(numbers));
		}

	}
}
