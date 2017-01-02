package geekforgeekbasic;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class RearrangingArray {
public static void rearrange(LinkedList<Integer> l1){
	Collections.sort(l1);
	for(int i=1; i <(l1.size()+1)/2; i++){
		Integer x = l1.getLast();
		l1.removeLast();
		l1.add(2*i-1,x);
	}
    System.out.println(l1);
}

public static void swap(int i, int j){
	int tmp = i;
	i=j;
	j=i;
}
		/**
 *  Output index j for an element arr[i]
 *  
 *  If (i < n/2) 
 *  j = 2*i + 1 
 *	Else
 *  j = 2*(n-1-i);
 *  
 * @param n
 * @return
 */
public static int[] arrange(int[] n){
	for(int i=0; i< n.length; i++){
		int tmp = n[i];
		while(tmp > 0){
			int j =(i < n.length/2 ) ? 2 * i+1: 2* (n.length-1-i);
			if(i==j){
				n[i]=-tmp;
				break;
			}
			swap(tmp, n[j]);
			n[j]=-n[j];
			i=j;
		}
	}
	for (int i=0; i<n.length; i++)
        n[i] = -n[i];
	
	return n;
}

	public static void main(String[] args) {
		Integer[] arr ={4,5,1,2,3};
		int[] test = {4,5,1,2,3};
	  LinkedList<Integer> ll = new LinkedList<Integer>(Arrays.asList(arr));
	 // rearrange(ll);
	 int[] newTest = arrange(test);
	// for(int c: ll)
	  for(int i : newTest)
		 System.out.println(i);
	} 

/*public static void main (String[] args)
{
    // Note that size of arr[] is considered 100 according to
    // the constraints mentioned in problem statement.
    int[] arr = new int[100];

    // Input the number of test cases you want to run
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    // One by one run for all input test cases
    while (t > 0)
    {
        // Input the size of the array
        int n = sc.nextInt();

        // Input the array
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        // Input the element to be searched
        int x = sc.nextInt();

        // Compute and print result
        System.out.println(search(arr, n, x));

        t--;
    }
}*/
}
