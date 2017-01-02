package array;
public class MaxNoTwoCon {
	 public static int FindMaxSum(int arr[], int n)  {
	        int incl = arr[0];
	        int excl = 0;
	        int excl_new;
	        int i;
	 
	        for (i = 1; i < n; i++)       {
	            /* current max excluding i */
	            excl_new = (incl > excl) ? incl : excl;
	 
	            /* current max including i */
	            incl = excl + arr[i];
	            excl = excl_new;
	        }
	 
	        /* return max of incl and excl */
	        return ((incl > excl) ? incl : excl);
	    }
	
	

	public static void main(String[] args) {
		int[] n ={5, 5, 10, 40, 50, 35};
System.out.println(FindMaxSum(n,n.length));
	}

}
