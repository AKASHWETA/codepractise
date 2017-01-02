package stringManupulation;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Find the kth largest element in an unsorted array. Note that it is 
 * the kth largest element in the sorted order, not the kth distinct element.
   For example, given [3,2,1,5,6,4] and k = 2, return 5.
   Note: You may assume k is always valid, 1 array's length.
 * @author apalewar
 *
 */
public class KthLargest {

	public static int findKthLargest(int[] nums, int k) {
		if(k<0|| nums ==null){
			return 0;
		}
		return getKth(nums.length -k +1,nums, 0, nums.length-1);
	}
	
	public static int getKth(int k, int[] nums, int start, int end){
		int pivot = nums[end];
		int left = start;
		int right = end;
	 
		while (true) {
			while (nums[left] < pivot && left < right) {
				left++;
			}
	 
			while (nums[right] >= pivot && right > left) {
				right--;
			}
	 
			if (left == right) {
				break;
			}
	 
			swap(nums, left, right);
		}
	 
		swap(nums, left, end);
	 
		if (k == left + 1) {
			return pivot;
		} else if (k < left + 1) {
			return getKth(k, nums, start, left - 1);
		} else {
			return getKth(k, nums, left + 1, end);
		}
	}
	
	public static void swap(int[] nums, int i, int j){
		int tmp = nums[i];
		nums[i] = nums[j];
		nums[j] = tmp;
	}
	
	static int sum(int[] numbers) {
	    int sum =0;
	    for(int i=0;i< numbers.length; i++){
	       sum+= numbers[i];
	    }
	        return sum;
	    }

public static int minLexRotation(String A){
		if(A == null)
			return -1;
		if(A.length()>100000)
			return -1;
	    // Find length of given string
	    int n = A.length();
	 
	    // Create an array of strings to store all rotations
	    String[] arr = new String[n];
	 
	    // Create a concatenation of string with itself
	    String concat = A + A;
	 
	    // One by one store all rotations of A in array.
	    // A rotation is obtained by getting a substring of concat
	    for (int i = 0; i < n; i++){
	    	  arr[i] = concat.substring(i, n);
	    }
	 
	    // Sort all rotations
	    Arrays.sort(arr);
	 
	    // Return the first rotation from the sorted array
	    return A.length()-String.valueOf(arr[0]).length();
	}

//This function prints all distinct elements
public static int findLength(int arr[]){
    int n = arr.length;
    int max_len = 1; // Initialize result
    if(n < 0 || n > 100000)
    	return -1;
    // One by one fix the starting points
    for (int i=0; i<n-1; i++)   {
        // Create an empty hash set and add i'th element to it.
        HashSet<Integer> set = new HashSet<>();
        if(arr[i] > 1000)
        	return -1;
        set.add(arr[i]);

        // Initialize max and min in current subarray
        int mn = arr[i], mx = arr[i];

        // One by one fix ending points
        for (int j=i+1; j<n; j++)    {
            // If current element is already in hash set, then
            // this subarray cannot contain contiguous elements
            if (set.contains(arr[j]))
                break;

            // Else add current element to hash set and update min, max if required.
            set.add(arr[j]);
            mn = Math.min(mn, arr[j]);
            mx = Math.max(mx, arr[j]);

            // We have already chached for duplicates, now check
            // for other property and update max_len if needed
            if (mx-mn == j-i)
                max_len = Math.max(max_len, mx-mn+1);
        }
    }
    return max_len; // Return result
}

public static int findLength1(int arr[])
{
	int n = arr.length;
	int max_len = 1; // Inialize result
    int max = 1;
    int prev_val = arr[0];
	// One by one fix the starting points
	for (int i=1; i<n; i++)
	{
		if (arr[i] == prev_val + 1){
		    max_len++;
		    max = Math.max(max_len, max);
		    prev_val = arr[i];
		} else if(arr[i] == prev_val) {
            			    
		} else {
		    max_len = 1;
		    prev_val = arr[i];
		}
	}
	return max; // Return result
}

public static int minSubArrayLen(int s, int[] nums) {
    if(nums == null || nums.length == 0){
        return 0;
    }
    if(nums.length == 1 && nums[0] < s){
        return 0;
    }
 
    // initialize min length to be the input array length
    int result = nums.length;
 
    int i = 0;
    int sum = nums[0];
 
    for(int j=0; j<nums.length; ){
        if(i==j){
            if(nums[i]>=s){ 
                return 1; //if single elem is large enough
            }else{
               j++;
 
               if(j<nums.length){
                    sum = sum + nums[j];
               }else{
                    return result;
               }
            }    
        }else{
            //if sum is large enough, move left cursor
            if(sum >= s){
                result = Math.max(j-i+1, result);
                sum = sum - nums[i]; 
                i++;
            //if sum is not large enough, move right cursor
            }else{
                j++;
 
                if(j<nums.length){
                    sum = sum + nums[j];
                }else{
                    if(i==0){ 
                        return 0;
                    }else{    
                        return result;
                    }
                }
            }
        }
    }
 
    return result;
}

//Sub array of sum of number passed
public static int maxSubArrayLen(int[] a, int k) {
    if(a == null || a.length == 0 || a.length > 100000){
    	        return 0;
    }
     
    int maxLen = 0;
    java.util.HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0, -1); // IMPOARTANT
    int sum = 0;
     
    for (int i = 0; i < a.length; i++) {
    	 if(a[i] > 1000)
         	return -1;
        sum += a[i];
        if (!map.containsKey(sum)) {
            map.put(sum, i);
        }
         
        if (map.containsKey(sum - k)) {
            maxLen = Math.max(maxLen, i - map.get(sum - k));
        }
    }
     
    return maxLen;
}

public static String getDomainName(String url) throws MalformedURLException{
    if(!url.startsWith("http") && !url.startsWith("https")){
         url = "http://" + url;
    }        
    URL netUrl = new URL(url);
    String host = netUrl.getHost();
    if(host.startsWith("www")){
        host = host.substring("www".length()+1);
    }
    return host;
}
	public static void main(String[] args) {
		int[] c = {1,2,0,33,22,21,22,23,24,25};
		//System.out.println(maxSubArrayLen(c,51));
		System.out.println(findLength1(c));
		//int i = maxSubArrayLen(c,4);
		// TODO Auto-generated method stub
		/*for(int i : c)
		System.out.println(i);*/
	}

}
