package practice;

public class SortTwoArray {
	
	public static int[] merge(int[] a, int[] b, int n, int m) {
		 int k = m + n - 1; // Index of last location of array b
		 int i = n - 1; // Index of last element in array b
		 int j = m - 1; // Index of last element in array a
		
		 // Start comparing from the last element and merge a and b
		while (i >= 0 && j >= 0) {
		 if (a[i] > b[j]) {
		a[k--] = a[i--];
		 } else {
		 a[k--] = b[j--];
		 }
		 }
		while (j >= 0) {
		 a[k--] = b[j--];
		 }
		return a;
		 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s = {2,7,9,12,0,0,0,0,0};
		int[] g = {1,3,4,5,6};
		merge(s,g,4,g.length);
		for(int i : s){
			System.out.print(i);
		}
	}

}
