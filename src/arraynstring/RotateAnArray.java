package arraynstring;

import java.util.Arrays;
import java.util.List;

public class RotateAnArray {

	public static void rotate(int[] arr, int order){
		if(arr==null || arr.length==0 || order <0){
			throw new IllegalArgumentException("Illegal Argument");
		}
		if(order> arr.length){
			order = order % arr.length;
		}
		int a = arr.length - order;
		reverse(arr,0,a-1);
		reverse(arr,a,arr.length-1);
		reverse(arr,0,arr.length-1);
		
	}
	
	public static void reverse(int[] arr, int left, int rigth){
		while(left < rigth){
			int tmp = arr[left];
			arr[left] = arr[rigth];
			arr[rigth]= tmp;
			left++;
			rigth--;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list =  Arrays.asList(1, 2, 3, 4, 5, 6, 7);

		System.out.println("Print all numbers:");
		


	}

}
