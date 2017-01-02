package practice;

public class TiplateProduct {
	public static int maxProduct(int arr[], int n){

		if(n<3)
		return -1;

		int maxA=Integer.MIN_VALUE;
		int maxB= Integer.MIN_VALUE;
		int maxC = Integer.MIN_VALUE;

		int minA = Integer.MIN_VALUE;
		int minB = Integer.MIN_VALUE;

		for(int i=0;i< n;i++){


		if(arr[i]> maxA)
		{
		maxC = maxB;
		maxB = maxA;
		maxA = arr[i];
		}else if(arr[i] > maxB){
		maxC =maxB;
		maxB = arr[i];
		}else if(arr[i]>maxC){
			maxC =arr[i];
		}

		if(arr[i]<minA){
		minB =minA;
		minA =arr[i];
		}

		else if(arr[i] < minB){
		minB = arr[i];
		}
		}
		return  Math.max(minA*minB*maxA, maxA*maxB*maxC);

		}
	
}
