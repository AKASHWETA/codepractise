package sorting;

/**
 * Best , Average,Worst Cases

*  Best Case        :    O(n^2)
* Average Case   :    O(n^2)
* Worst Case      :    O(n^2)
 * @author apalewar
 *
 */
public class SelectionSort {
	private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
	  public static int[] sort(int[] list) {
	        for (int i = 0; i < list.length - 1; i++) {
	            // Find the index of the minimum value
	            int minPos = i;
	            for (int j = i + 1; j < list.length; j++) {
	                if (list[j] < list[minPos]) {
	                    minPos = j;
	                }
	            }
	            swap(list, minPos, i);
	        }
	        return list;
	    }
	
	public static void main(String[] args) {
		int[] numbers = {5,8,0,2,7,9,12,84};
		
		sort(numbers);
		for(int i:numbers){
			System.out.print(i);
			System.out.print(" ");
		}
	}
}
