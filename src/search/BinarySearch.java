package search;

import java.util.Arrays;

public class BinarySearch {

	public static int BinarySearch(int[] arr, int searchKey){
		int start=0;
		int end= arr.length-1;
		
		while(start <=end){
			int mid = start +end/2;
			if(searchKey==arr[mid]){
				return mid;
			}
			if(searchKey < arr[mid]){
				end = mid-1;
			}else{
				start = mid+1;
			}
			
		}
		return -1;
	}
	public static int hitBinarySerach(int[] a, int key){
		int lo = 0;
		int hi = a.length - 1;
		while (lo <= hi) {
        // Key is in a[lo..hi] or not present.
			int mid = lo + (hi - lo) / 2;
			if (key < a[mid]) hi = mid - 1;
			else if (key > a[mid]) lo = mid + 1;
			else return mid;
		}
		return -1;
    }
	
	public static int hitBinarySearMy(int[] a, int key){
		int lo= 0;
		int hi = a.length-1;
		while(lo<=hi){
			int mid = lo+(hi-lo)/2;
			if(key < a[mid]) hi = mid-1;
			else if(key > a[mid]) lo = mid+1;
			else return mid;
		}
return -1;
	}
	public static void main(String[] args){
		  int[] arr1= {1,34,45,55,234, 421};
		 // int searchKey = 34;
		  //System.out.println("Key "+searchKey+" found at index: "+BinarySearch(arr1, searchKey));
	        int[] arr2= {9,24,56,67,123,421,445,595,2134};
	        Arrays.sort(arr2);

	    int searchKey = 421;
	    System.out.println("Key "+searchKey+" found at index: "+hitBinarySearMy(arr2, searchKey));
	    }
	//See more at: http://www.java2novice.com/java-search-algorithms/linear-search/#sthash.2y2uoZHm.dpuf

}
