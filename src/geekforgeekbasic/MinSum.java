package geekforgeekbasic;

import java.util.Arrays;
/**
 * A minimum number will be formed from set of digits when smallest digit appears
 *  at most significant position and next smallest digit appears at next most significant position ans so on..
 The idea is to sort the array in increasing order and build two numbers by alternating picking digits from the array.
  So first number is formed by digits present in odd positions in the array and second number
   is formed by digits from even positions in the array. Finally, we return the sum of first and second number.

 * @author apalewar
 *
 */
public class MinSum {
	public static int solve(int arr[], int n){
		// sort the array
		Arrays.sort(arr);
		// let two numbers be a and b
		int a = 0, b = 0;
		for (int i = 0; i < n; i++)	{
			// fill a and b with every alternate digit
			// of input array
			if (i % 2 ==0){
				a = a * 10 + arr[i];
			}else
				b = b * 10 + arr[i];
		}
		// return the sum
		return a + b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] test = {5,3,0,7,4};
		int[] test = {7,4,0,9, 4, 8, 8, 2, 4, 5, 5, 1}; 
		System.out.println(solve(test,test.length));
	}

}
