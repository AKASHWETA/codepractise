package practice;

public class SumPair {

	private static void swap(int a[], int i, int j){
		int tmp = 0;
		tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	public static void quickSort(int[] list,int lowerIndex, int higherIndex){
		int i = lowerIndex;
		int j = higherIndex;
		int pivot  = list[lowerIndex+(higherIndex-lowerIndex)/2];
		while(i<j){
			while(list[i]<pivot){
				i++;
			}
			while(list[j]>pivot){
				j--;
			}
			if(i<=j){
				swap(list,i,j);
				i++;
				j--;
			}
			if(lowerIndex<j){
				quickSort(list,lowerIndex,j);	
			}
			if(i< higherIndex){
				quickSort(list,i,higherIndex);
			}
		}
	}
	
public static int hasArrayTwoCandidates(int[] list,int size, int sum){
	int i=0; 
	int r =size; 
	while(i<r){
		if(list[i]+list[r]==sum){
			return 1;
		}else if(list[i]+list[r] < sum){
			i++;
		}else{//if(list[i]+list[r] > sum){
			r--;
		}
	}
	return 0;
}

public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] A = {1,4,45,6,10,-8};
		quickSort(A,0,A.length-1);
		System.out.println(hasArrayTwoCandidates(A,A.length-1,16));
		String*/
	String[] n = {"0.3434 3422 23423","0.3434 3422 23423"};
	double curr1 = 0.0;
	for(String quote: n){
		String[] curr = quote.split(" ");
	        curr1 = Double.parseDouble(curr[0]);
	        System.out.println(curr1);
	}
	}

}
