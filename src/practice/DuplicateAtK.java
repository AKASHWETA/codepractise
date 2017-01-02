package practice;

import java.util.HashSet;

public class DuplicateAtK {
	 static boolean checkDuplicatesWithinK(int arr[], int k)   {
	        // Creates an empty hashset
	        HashSet<Integer> set = new HashSet<>();
	 
	        // Traverse the input array
	        for (int i=0; i<arr.length; i++)
	        {
	            // If already present n hash, then we found 
	            // a duplicate within k distance
	            if (set.contains(arr[i]))
	               return true;
	 
	            // Add this item to hashset
	            set.add(arr[i]);
	 
	            // Remove the k+1 distant item
	            if (i >= k)
	              set.remove(arr[i-k]);
	        }
	        return false;
	    }
	 public static void main (String[] args)
	    {
	        int arr[] = {11, 2, 3, 4, 25,45,56,0,2,5};
	        if (checkDuplicatesWithinK(arr, 3))
	           System.out.println("Yes");
	        else
	           System.out.println("No");
	    }
}
