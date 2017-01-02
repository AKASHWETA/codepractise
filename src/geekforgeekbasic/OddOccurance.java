package geekforgeekbasic;

public class OddOccurance {
	public static int findCandidate(int arr[], int len) 
	{
		 int result = 0;
		    for(int i=0;i<len;i++)
		        result ^= arr[i];
		    
		    return result;
	  
	}
	/**
	 * two number are odd
	 * @param src
	 * @return
	 */
	public int[] findUnique(int[] src){
	    int[] res =  new int[2];
	    int resIdx = 0;

	    for(int i = 0; i < src.length;){
	        // at the end of the list, or next is different
	        if(i == src.length-1 || src[i] != src[i+1]){
	            res[resIdx++] = src[i++];
	            if (resIdx== 2) break;
	        } else{
	            // not different; skip next item
	            i+=2;
	        }
	    }
	    return res;
	}
	
	

	public static void main(String[] args) {
		int[] y ={11,11,11,56,11,9,56};
		System.out.println(findCandidate(y,y.length));
	}

}
