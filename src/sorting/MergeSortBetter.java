package sorting;

/**
 * Best , Average,Worst Cases

*  Best Case    :    O(n log n) , or  O(n)   
*  Average Case  :    O(n log n)
*  Worst Case    :    O(n log n)

 * @author apalewar
 *
 */
public class MergeSortBetter {
	
public static int[]	mergeSort(int[] list){
	if(list.length<=1){
		return list;
	}
	
	int[] first = new int[list.length/2];
	int[] second = new int[list.length - first.length];
	System.arraycopy(list, 0, first,0,first.length);
	System.arraycopy(list,first.length,second,0,second.length);
	
	mergeSort(first);
	mergeSort(second);
	// Merge the halves together, overwriting the original array
    merge(first, second, list);
	return list;
}



public static void mergeAll(int[] first, int[] second, int[] list){
	int iFirst = 0;
	int iSecond =0;
	int j=0;
	while(iFirst<first.length && iSecond < second.length){
		if(first[iFirst]<second[iSecond]){
			list[j] = first[iFirst];
			iFirst++;
		}else{
			list[j] = second[iSecond];
			iSecond++;
		}
		j++;
	}
	System.arraycopy(first,iFirst,list,j,first.length-iFirst);
	System.arraycopy(second,iSecond,list,j,second.length-iSecond);
}
public static void merge(int[] first, int[]second, int[] list){
	// Merge both halves into the result array
    // Next element to consider in the first array
	int iFirst = 0;
	// Next element to consider in the second array
	 int iSecond = 0;
	// Next open position in the result
     int j = 0;
     // As long as neither iFirst nor iSecond is past the end, move the
     // smaller element into the result.
     while((iFirst < first.length ) && (iSecond < second.length)){
    	 if(first[iFirst] < second[iSecond]){
    		  list[j] = first[iFirst];
    		  iFirst++;
    	 }else{
    		  list[j] = second[iSecond];
    		  iSecond++;
    	 }
    	 j++;
     }
     // copy what's left
     // copy what's left
     System.arraycopy(first, iFirst, list, j, first.length - iFirst);
     System.arraycopy(second, iSecond, list, j, second.length - iSecond);
     
}


public static void mergeAll1(int[] list, int[] first,int[] second){
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] numbers = {9,2,6,3,7,4,8};
		 numbers=mergeSort(numbers);
	        System.out.println(" ");
	        System.out.println(" ");
	        System.out.println(" ");
	        System.out.println("Values after Merge Sort : ");
	        for (int j=0;j<numbers.length;j++) {
	            System.out.println(numbers[j]+" ");
	}
}
}
