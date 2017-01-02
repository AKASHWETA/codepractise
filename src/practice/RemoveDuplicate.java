package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class RemoveDuplicate {

public static boolean testMyLuck(String s ){
	boolean[] check = new boolean[256];
	for(int i=0; i<s.length(); i++){
		int val = s.charAt(i);
		if(check[val]) return false;
		check[val]= true;
	}
	return true;
}

	//Charecters from string
public static char[] removeDupE(char[] str){
		if (str == null)
			return str;
		if (str.length < 2)
			return str;

		boolean[] hits = new boolean[256];
		for (int i = 0; i < 256; ++i) {
			hits[i] = false;
		}

		hits[str[0]] = true;
		int tail = 1;

		for (int i = 1; i < str.length; ++i) {
			if (!hits[str[i]]) {
				str[tail] = str[i];
				tail++;
				hits[str[i]] = true;

			}
}
	while(tail < str.length)
		str[tail++]=0;
 return str;
}


/**
 * Given an array of n elements which contains elements with values ranging
 *  from 0 to n-1(thus k will always be smaller than n), 
 * and can have p number of repeating elements 
 * with frequency f_i. Find each repeating element with its frequency
 * @param arr
 * @param n
 * @param k
 */

public static void findRepeatingElements(int[] arr,int n, int k){
	System.out.println("K" + k);
	for(int c: arr){
		int h =   c%k;
	System.out.println(c+" >>"+h +">>"+(h+k));
	}
	for(int i=0; i<n; i++){
		arr[arr[i]%k] += k;
	}
	for(int c: arr){
		System.out.println(c+" >>"+ c/k);
		}
	for(int i=0; i<n;i++){
		if(arr[i]-k >=k){
			System.out.println(i +" is repeated"+arr[i]/k + "times");
		}
	}
	// Uncomment this code to get the original array back
	/*for (int i = 0; i< n; i++)
		arr[i] = arr[i]%k;*/
}

public static int[] removeDuplicatefromArray(int[] array){
	int[] tmp = new int[array.length];
	int j = 0;
	Arrays.sort(array);
	for(int i=0;i<tmp.length-1;i++){
		if(array[i]!=array[i+1]){
			tmp[j++]= array[i];
		}
	}

	return tmp;
}

public static void main(String[] args){
	/*int arr[] = {1,2,2,3,4,4};
		  int arr_size = arr.length;
		 findRepeatingElements(arr, arr_size,arr_size);*/
	System.out.println(String.valueOf(removeDupE("AKASHShhh".toCharArray())));
	
	}
	

	 
}
