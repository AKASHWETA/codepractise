package search;

import java.util.Arrays;

public class LinearSearch {

	public static int linerSearch(int[] arr, int serachKey){
		for(int i=0; i<arr.length; i++){
			if(arr[i]== serachKey){
				return i;
			}
		}
		return -1;
	}
	 public static int binarySearch(String[] words, String value) {
	        return binarySearch(words, value, 0, words.length - 1);
	    }
	    
	    /**
	     * Searches an array of words for a given value using a recursive binary 
	     * search.  Returns the index that contains the value or -1 if the value 
	     * is not found.
	     * @param words
	     * @param value
	     * @return
	     */    
	    public static int binarySearch(String[] words, String value, int min, int max) {
	        if (min > max) {
	            return -1;
	        }
	        
	        int mid = (max + min) / 2;
	        
	        if (words[mid].equals(value)) {
	            return mid;
	        } else if(words[mid].compareTo(value) > 0) {
	            return binarySearch(words, value, min, mid - 1);
	        } else {
	            return binarySearch(words, value, mid + 1, max);
	        }
	    }
	    
	    public static int search(String[] strings, String str, int first,int last){
	    	while(first< last){
	    	//ensure thr is something at the end
	    	while(first < last && strings[last]==""){
	    		--last;
	    	}

	    	if(first> last) return -1;

	    	int mid = (last + first) >>1;

	    	while(strings[mid]==""){
	    		mid++;
	    	}

	    	int r = strings[mid].compareTo(str);

	    	if(r==0) return mid;

	    	if(r<0) {
	    		first = mid+1;
	    	}else{
	    		last = mid -1;
	    	}
	    	} 
	    	return -1;
	    	}
	    
	    public static int searchnonEmpty(String[] string, String str, int first, int last){
	    	
	    	while(first<last){
	    		while(first < last && string[last] ==""){
	    			--last;
	    		}
	    		
	    		if(first> last) return -1;
	    		
	    		int mid = (first + last)>>1;
	    	while(string[mid]==""){
	    		mid++;
	    	}
	    	int r = string[mid].compareTo(str);
	    	if(r==0) return mid;
	    	if(r<0){
	    		first =mid+1;
	    	}else{
	    		first = mid-1;
	    	}
	    	}
	    	return -1;
	    }

	public static void main(String[] args){
		  /*int[] arr1= {23,45,21,55,234,1,34,34,90};
		  int searchKey = 34;
		  System.out.println("Key "+searchKey+" found at index: "+linerSearch(arr1, searchKey));
	        int[] arr2= {123,445,421,595,2134,41,304,190};
	        searchKey = 421;*/
	        //System.out.println("Key "+searchKey+" found at index: "+linerSearch(arr2, searchKey));//
	        String[] words = {"at", "", "", "", "ball", "","", "car", "", "", "dad", "", "","ball"};
	       System.out.println("Key ballfound at index: "+search(words,"ball",0,words.length-1));
	       // System.out.println("search for ball = " + binarySearch(words, "ball"));
	//	String[] array = {"bear", "bird", "cat", "dog", "fish", "koala", "lion", "tiger", "turtle", "zebra"};
        //System.out.println("array = " + Arrays.toString(array));
        
        /*String[] queries = {"cat", "lion"};
        for (String s : queries) {
            System.out.println("search for " + s + " = " + binarySearch(array, s));
        }*/
	    }
	//See more at: http://www.java2novice.com/java-search-algorithms/linear-search/#sthash.2y2uoZHm.dpuf
}

