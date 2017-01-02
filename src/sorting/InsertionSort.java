package sorting;

/**
 * Best , Average,Worst Cases

*  Best Case        :    O(n)
*  Average Case   :    O(n^2)
*  Worst Case      :    O(n^2)
 * @author apalewar
 *
 */
public class InsertionSort {

	public static void sort(char[] a){
		int n = a.length;
		for(int i =1;i<n; i++){
			char cur =a[i];
			int j= i-1;
			while((j >=0) && (a[j]>cur)){
				a[j+1]= a[j--];
				a[j+1] =cur;
			}
		}
	}
	
	public static void sort1(int[] list){
		for(int i=1; i<list.length;i++){
			int curr =list [i];
			int j = i-1;
			while(j > 0 && (list[j] >curr)){
				list [j+1] = list[j--];
			list[j+1] = curr;
			}
		}
	}
	public static void main(String[] args) {
		//char[]//a = {'b','c','a','d','x','h','e'};
		int[] a= {3,5,8,1,0,11,4};
		sort1(a);
		for(int b : a)
		System.out.println(">>>"+ b);
	}

}
