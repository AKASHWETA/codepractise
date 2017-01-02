package practice;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WaysToTileAFloor {
	/**
	 * Explanation:
We need 3 tiles to tile the board of size  2 x 3. 
We can tile the board using following ways
1) Place all 3 tiles vertically. 
2) Place first tile vertically and remaining 2 tiles horizontally.
3) Place first 2 tiles horizontally and remaining tiles vertically

Let “count(n)” be the count of ways to place tiles on a “2 x n” grid, we have following two ways to place first tile.
1) If we place first tile vertically, the problem reduces to “count(n-1)”
2) If we place first tile horizontally, we have to place second tile also horizontally. So the problem reduces to “count(n-2)”

Therefore, count(n) can be written as below.

   count(n) = n if n = 1 or n = 2
   count(n) = count(n-1) + count(n-2) 
The above recurrence is noting but Fibonacci Number expression. We can find n’th Fibonacci number in O(Log n) time, see below for all method to find n’th Fibonacci Number.

Different methods for n’th Fibonacci Number.

This article is contributed by Saurabh Jain. Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above

	 * @param n
	 * @return
	 */
public static int floorATile(int n)	{
	// Create a table to store results of subproblems
    // dp[i] stores count of ways for i x 2 grid.
	int[] dp = new int[n+1];
    dp[0] = 0;

    // Fill the table from d[1] to dp[n]
    for (int i=1; i<=n; i++)  {
        // Base cases
        if (i >= 1 && i <=1)
            dp[i] = 1;
        else if (i==2)
            dp[i] = 2 ;
        else {
        // dp(i-1) : Place first tile horizontally
        // dp(n-2) : Place first tile vertically
        //which means 3 more tiles have
        //to be placed vertically.
        dp[i] = dp[i-1] + dp[i-2];
      }

    }

    return dp[n];
   }

public static int febonicciSeries(int n){
	int[] dp = new int[n+1];
	dp[0] =0;
	for(int i=1;i<=n;i++){
		if(i >=1 && i <=1){
			dp[i] =1;
			}else if(i==2){
			dp[i]=2;
			}else{
			dp[i]=dp[i-1]+dp[i-2];
		}
	}
		
	return dp[n];
}

	public static void oddOccurance(int[] n){
		boolean[] newArrayy = new boolean[n.length];
		for(int i=0;i<n.length;i++){
			if(n[i] % 2 ==0){
				
			}
		}
	}
	private static final char SEPARATOR = 0x20;
	private static final int MESSAGE_TYPE = 1;
	 public void someFunction(List<String> list) {

if (list != null) { 
    for (Iterator itr = list.iterator(); itr.hasNext(); ) { 
        if ("bad".equals(itr.next())) itr.remove(); 
    }
}	       // do some work on cleaned "list"       

	   }
	public static void login() {
		String s= "^([0-9]+)$";

	    System.out.println(SEPARATOR + MESSAGE_TYPE + "=A");

	}
	 private  final Character m_value = 'a';
	    
	    public String toString() { return "" + m_value; }
	public static void main(String[] args) {
		String s= "^([0-9]+)$";
		 // Create a Pattern object
	      Pattern r = Pattern.compile(s);
	      Matcher m = r.matcher("22\t1");
	      System.out.println(m.find());
		
	}
}
