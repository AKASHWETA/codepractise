package sorting;

import java.util.Arrays;


/**
 * Best , Average,Worst Cases

*  Best Case        :    O(n log n)
* Average Case   :    O(n log n)
* Worst Case      :    O(n^2)

 * @author apalewar
 *
 */
public class QuickSort {

	 private static void swap(int[] a, int i, int j) {
	        int temp = a[i];
	        a[i] = a[j];
	        a[j] = temp;
	 }
	 
	 private static void quickSort(int list[], int lowerIndex, int higherIndex) {
		 	int i = lowerIndex;
		 	int j = higherIndex;
		 	 // calculate pivot number, I am taking pivot as middle index number - See more at: http://www.java2novice.com/java-sorting-algorithms/quick-sort/#sthash.svfZbGMK.dpuf
		 	int pivot = list[lowerIndex+(higherIndex-lowerIndex)/2];
		 	//devide into two array
		 	while(i<=j){
		 		/**
		 		 * * In each iteration, we will identify a number from left side which
	             * is greater then the pivot value, and also we will identify a number
	             * from right side which is less then the pivot value. Once the search
	             * is done, then we exchange both numbers.
				 - See more at: http://www.java2novice.com/java-sorting-algorithms/quick-sort/#sthash.svfZbGMK.dpuf
		 		 */
		 		
		 		while(list[i]< pivot){
		 			i++;
		 		}
		 		
		 		while(list[j]> pivot){
		 			j--;
		 		}
		 		if(i<=j){
		 			swap(list,i,j);
			 		i++;
			 		j--;
		 		}
		 	}
		 	
		 	if(lowerIndex <j)
		 		quickSort(list,lowerIndex,j);
		 	if(i<higherIndex)
		 		quickSort(list,i,higherIndex);
	 }
	

	 // Helper method that kicks off the recursive quicksort method
    public static int[] quicksort(int [] list) {
        quickSort(list, 0, list.length-1);
        return list;
    }
    public static int[] quickSort1(int[] list){
    	quickoSorto(list,0, list.length-1);
    	return list;
    }
    public static void quickoSorto(int[] list,int lowerIndex, int higherIndex){
    	int i =lowerIndex; 
    	int j=higherIndex;
    	int pivot = list[lowerIndex + (higherIndex-lowerIndex)/2];
    	
    	while(i<=j){
    		while(list[i]< pivot){
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
    		if(lowerIndex<j)
    			quickoSorto(list,lowerIndex,j);
    		if(i< higherIndex)
    			quickoSorto(list,i,higherIndex);
    	}
    	
    }
	public static void main(String[] args) {
		int[] numbers = {5,8,0,2,7,9,12,84};
		System.out.println(Arrays.toString(numbers));
		quickSort1(numbers);
		for(int i:numbers){
			System.out.print(i);
			System.out.print(" ");
		}
	}

}
