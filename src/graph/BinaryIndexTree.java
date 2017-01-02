package graph;

public class BinaryIndexTree {
	
	// Constructs and returns a Binary Indexed Tree for given
	// array of size n.
	public int[] constructBIT(int arr[], int n){
		int[] bit = new int[n+1];
		for(int i =0; i<n;i++){
			bit[i]=0;
		}
		for(int i=0; i<n; i++){
			updateBIT(bit, n,i,arr[i]);
		}
		
		for(int i=0; i<n; i++){
			System.out.println("BIT "+ bit[i]);
		}
		return bit;
	}
	
	// Updates a node in Binary Index Tree (BITree) at given index
	// in BITree.  The given value 'val' is added to BITree[i] and 
	// all of its ancestors in tree.
	public void updateBIT(int[] bit, int n, int index, int val){
		// index in BITree[] is 1 more than the index in arr[]
	    index = index + 1;
	    
	 // Traverse all ancestors and add 'val'
	    while (index <= n)  {
	       // Add 'val' to current node of BI Tree
	       bit[index] += val;
	       // Update index to that of parent in update View
	       index += index & (-index);
	    }
	}

	public int getSum(int[] bit, int index){
		 int sum = 0; // Iniialize result
	    // index in BITree[] is 1 more than the index in arr[]
	    index = index + 1;
		 
		// Traverse ancestors of BITree[index]
		while (index>0) {
		    // Add current element of BITree to sum
		    sum += bit[index];
		    // Move index to parent node in getSum View
		        index -= index & (-index);
		 }
	  return sum;
	}
	// Returns inversion count arr[0..n-1]
	public int getInvCount(int arr[], int n){
	    int invcount = 0; // Initialize result
	 int[] bit=null;
	    // Find maximum element in arr[]
	    int maxElement = 0;
	    for (int i=0; i<n; i++){
	        if (maxElement < arr[i]){
	            maxElement = arr[i];
	        }
	    }
	    
	    // Create a BIT with size equal to maxElement+1 (Extra
	    // one is used so that elements can be directly be
	    // used as index)
	     bit = new int[maxElement+1];
	    for (int i=1; i<=maxElement; i++){
	        bit[i] = 0;
	    }
	    // Traverse all elements from right.
	    for (int j=n-1; j>=0; j--) {
	        // Get count of elements smaller than arr[i]
	        invcount += getSum(bit,arr[j]-1);
	 
	        // Add current element to BIT
	        updateBIT(bit,maxElement, arr[j], 1);
	    }
	 
	    return invcount;
	}
	public int getSum(int x,int[] bit1, int bit2[]){
		return (getSum(bit1, x) * x) - getSum(bit2, x);
	}
	
	public void updateRange(int[] bit1, int[] bit2, int index, int val,int l,int r){
		// Update Both the Binary Index Trees
	    // As discussed in the article
	 
	    // Update BIT1
		updateBIT(bit1,bit1.length,l,val);
		updateBIT(bit1,bit1.length,r+1,-val);
		// Update BIT1
		updateBIT(bit1,bit1.length,l,val*(l-1));
		updateBIT(bit2,bit2.length,r+1,-val*r);
	}
	public static void main(String[] args) {
		int freq[] = {2, 1, 1, 3, 2, 3, 4, 5, 6, 7, 8, 9};
		BinaryIndexTree biTree = new BinaryIndexTree();
		/*biTree.constructBIT(freq, freq.length);
		System.out.println("Sum of elements in arr[0..5] is " +biTree.getSum(5));
		// Let use test the update operation
	    freq[3] += 6;
	    biTree.updateBIT(freq.length, 3, 6); //Update BIT for above change in arr[]
	    System.out.println("Sum of elements in arr[0..5] is " +biTree.getSum(5));
	    int arr[] = {8, 4, 2, 1};
	    System.out.println(biTree.getInvCount(arr,arr.length));*/
		int[] BITTree1 =biTree.constructBIT(freq, freq.length);
		int[] BITTree2;
		
	}

}
