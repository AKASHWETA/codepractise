package practice;


/**
 * The idea is to see remainder of every element when divided by 3. A set of elements can form a group only if sun of their remainders is multiple of 3. Since the task is to enumerate groups, we count all elements with different remainders.

1. Hash all elements in a count array based on remainder, i.e, 
   for all elements a[i], do c[a[i]%3]++;
2. Now c[0] contains the number of elements which when divided
   by 3 leave remainder 0 and similarly c[1] for remainder 1 
   and c[2] for 2.
3. Now for group of 2, we have 2 possibilities
   a. 2 elements of remainder 0 group. Such possibilities are 
      c[0]*(c[0]-1)/2
   b. 1 element of remainder 1 and 1 from remainder 2 group
      Such groups are c[1]*c[2].
4. Now for group of 3,we have 4 possibilities
   a. 3 elements from remainder group 0.
      No. of such groups are c[0]C3
   b. 3 elements from remainder group 1.
      No. of such groups are c[1]C3
   c. 3 elements from remainder group 2.
      No. of such groups are c[2]C3
   d. 1 element from each of 3 groups. 
      No. of such groups are c[0]*c[1]*c[2].
5. Add all the groups in steps 3 and 4 to obtain the result.
 * @author apalewar
 *
 */
public class PossibleGroup {
	// Returns count of all possible groups that can be formed from elements
	// of a[]
public static int findGroups(int[] array, int n){
	// Create an array C[3] to store counts of elements with remainder
    // 0, 1 and 2.  c[i] would store count of elements with remainder i
    int[]  c = new int[array.length];
    int i =0;
    int res = 0; // to store the result
    //count element with reminder 0,1,2
    for(i=0;i<n; i++)
    	c[array[i] % 3]++;
    	
    // Case 3.a: Count groups of size 2 from 0 remainder elements
    res +=((c[0]*(c[0]-1))>>1);
   
    // Case 3.b: Count groups of size 2 with one element with 1
    // remainder and other with 2 remainder
    res +=c[1]*c[2];
    
 // Case 4.a: Count groups of size 3 with all 0 remainder elements
    	res += (c[0] * (c[0]-1) * (c[0]-2))/6;
    	// Case 4.b: Count groups of size 3 with all 1 remainder elements
        res += (c[1] * (c[1]-1) * (c[1]-2))/6;
     
        // Case 4.c: Count groups of size 3 with all 2 remainder elements
        res += ((c[2]*(c[2]-1)*(c[2]-2))/6);
     
        // Case 4.c: Count groups of size 3 with different remainders
        res += c[0]*c[1]*c[2];
     
        // Return total count stored in res
    	return res;
}

public static  int sumOfGroup(int[] n){
	int result =0;
	int[] c = new int[n.length];
	for(int i=0; i< n.length; i++)
		c[n[i] % 3]++;
	
	result += (c[0] * (c[0]-1))/2;
	result += c[1] * c[2];
	
	result +=(c[0] * (c[0]-1) * (c[0]-2))/6;
	result +=(c[1] *(c[1]-1) * (c[1]-2))/6;
	result +=(c[2] * (c[2]-1) * (c[1]-2))/6;
	
	return result;
}
	public static void main(String[] args) {
		 int arr[] = {3, 6, 7, 2, 9};
		   /* int n = 5;
		    Scanner input = new Scanner(System.in);
			int numOfT = input.nextInt();
			int[] numbers = new int[n];
			for(int i=0; i<=numOfT; i++){
			    for (int j = 0; i < n; i++){	   
			           numbers[i] = input.nextInt();
			    }*/
			    System.out.println(sumOfGroup(arr));
			}
	//}

}
