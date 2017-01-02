package geekforgeekbasic;

import java.lang.reflect.Array;
import java.util.Arrays;


public class EvenOccurance {
	
	public static final int[] findDuplicates(final int[] data) {
	    // take a copy of the data.
	    int[] sorted = Arrays.copyOf(data, data.length);
	    // sort it. This is O(n log(n)) which will be the bulk of our time.
	    Arrays.sort(sorted);

	    // now scan the sorted data for even-numbered sequences of values.
	    int len = 0;
	    boolean even = false;
	    // sorted[0] is our first sequence, and currently it is not even.
	    // note that the scan starts at position 1.
	    for (int i = 1; i < sorted.length; i++) {
	        if (sorted[i] == sorted[len]) {
	            // this element is the same as the sequence, so 'count' the even-ness.
	            even = !even;
	        } else {
	            // this element is different to our sequence, it's a new sequence.
	            if (even) {
	                // the old sequence had an even count, so we 'preserve' it.
	                len++;
	            }
	            // move the value of the new sequence to the 'beginning'.
	            sorted[len] = sorted[i];
	            // and the new sequence is odd.
	            even = false;
	        }
	    }
	    if (even) {
	        // the last sequence was even, we preserve it.
	        len++;
	    }
	    // return the first part of the array, which contains the even sequence values.
	    return Arrays.copyOf(sorted, len);
	}
	
	public static void oddccurance(int[] arr){
		int count =0;
		for(int i=0;i<arr.length;i++){
			count ^= arr[i];
		}
		System.out.println(""+ count);
	}

	public static void main(String[] args) {
	int[] tets= {10,34,10,56,89,89,89,89};
	int[] t = findDuplicates(tets);
	for(int  c: t)
		System.out.println(c);
	//int[] j = {1,1,2,3,3,4,4};
	//oddccurance(j);
	
	}
	}
