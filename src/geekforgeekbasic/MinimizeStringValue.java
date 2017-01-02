package geekforgeekbasic;

import java.util.Arrays;
import java.util.Scanner;

/**. Traverse through the string and note down the number of times the directions were addressed in route.
2. Check the maximum of South and North directions and add the (MAX - MIN) to the route. 
E.g, SSSNNNNN - S(3) & N(5) - Result - NN
3. Repeat the step 2 for East and West directions.
4. Compile the result by combining the results of 2 & 3 steps such that they are lexicographically sorted.(If Es are the result of 3, they come first.)
**/
public class MinimizeStringValue {public static int MinimizeValue(String n, int k){
	int[] charCount = new int[256];
	for(int i=0; i< n.length(); i++){
		if(charCount[n.charAt(i)]!=0){
			charCount[n.charAt(i)]++;
		}else{
			charCount[n.charAt(i)] =1;
		}
	}
	Arrays.sort(charCount);
	int sum =0;
	for(int i=charCount.length-1-k;i>=(charCount.length-n.length()-2);i--){
		sum+= charCount[i] * charCount[i];
	}
	return sum+k;
}
	public static void main (String[] args) {
	
        String s = "aabccd";
       
        int n = 2;
        System.out.println(MinimizeValue(s,n));
 

	 }}

