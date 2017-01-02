package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**o(n log n)
 * worst case o(n^2)
 * Time Complexity of Solution:
 *   Best Case O(k*n); Average Case O(k*n); Worst Case O(k*n),
 *   where k is the length of the longest number and n is the
 *   size of the input array.
 *
 *   Note: if k is greater than log(n) then an n*log(n) algorithm would be a
 *         better fit. In reality we can always change the radix to make k
 *         less than log(n)
 * @author apalewar
 *
 */
public class ReddixSort {
	
	public static int getMax(int arr[]){
		int max = arr[0];
		for(int i=0; i< arr.length;i++){
			if(max < arr[i]){
				max = arr[i];
			}
		}
		return max;
	}
	
	public static void reddixSor(int[] arr, int n, int exp){
		int output[] = new int[n];
		int[] count = new int[10];
		int i;
		Arrays.fill(count, 0);
		
		for(i=0; i< n; i++)
			count[(arr[i]/exp)%10]++;
		
		for(i=1; i<10; i++){
			count[i] += count[i-1];
		}
		
		for(i =n-1; i>=0; i--){
			output[count[(arr[i]/exp)%10]-1]= arr[i];
			count[(arr[i]/exp)%10]--;
		}
		
		for(i=0;i<n;i++)
			arr[i] = output[i];
	}
   
	public static void reddix(int[] arr){
		
		int m = getMax(arr);
		for(int exp =1; m/exp>0; exp *=10)
			reddixSor(arr,arr.length,exp);
	}

	public static void main(String[] args) {
		
		int[] numbers= {18,5,100,3,1,19,6,0,7,4,2};
		reddix(numbers);
		
		for(int i : numbers){
			System.out.println(i);
		}
		
	// TODO Auto-generated method stub

	}

}
