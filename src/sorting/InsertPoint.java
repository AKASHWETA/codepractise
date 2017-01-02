package sorting;

public class InsertPoint {
	    public static  int searchInsert(int[] A, int target) {
	        if(A==null||A.length==0)
	            return 0;
	 
	        return searchInsert(A,target,0,A.length-1);
	    }
	 
	    public static int searchInsert(int[] A, int target, int start, int end){
	        int mid=(start+end)/2;
	 
	        if(target==A[mid]) 
	            return mid;
	        else if(target<A[mid]) 
	            return start<mid?searchInsert(A,target,start,mid-1):start;
	        else 
	            return end>mid?searchInsert(A,target,mid+1,end):(end+1);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stubsysout
		
		int[] a= {1,3,5,6};
		System.out.println(searchInsert(a,9));

	}

}
