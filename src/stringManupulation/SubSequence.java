package stringManupulation;

import java.util.HashSet;
import java.util.Set;


/**
 * If there are no repetitions, then count becomes double of count 
 * for n-1 because we get count(n-1) more subsequences by adding current character at the end 
 * of all subsequences possible with n-1 length. If there repetitions, then we find count of 
 * all distinct subsequences ending with previous occurrence. 
 * This count can be obtained be recursively calling for index of previous occurrence.
 * Since above recurrence has overlapping subproblems, we can solve it using Dynamic Programming.
   Below is C++ implementation of above idea.
 * @author apalewar
 *
 */
public class SubSequence {

	
	public static int countsubSe(String s){
		int[] last = new int[256];
		int n = s.length();
		int[] dp = new int[n+1];
		dp[0] =1;
		
		for(int i=1; i<=n; i++ ){
			dp[i] = 2 * dp[i-1];
			if(last[s.charAt(i-1)]!=-1){
				dp[i] = dp[i] - dp[last[s.charAt(i-1)]];
				last[s.charAt(i-1)] = i-1;
			}
		}
				
		
		return dp[n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(countsubSe("gfg"));
	}

}
