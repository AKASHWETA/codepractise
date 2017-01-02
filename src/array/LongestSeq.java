package array;

import java.util.Arrays;

public class LongestSeq {
	
	public static int printLongestConsequtiveSequence(int[] array){
		Arrays.sort(array);
		int currentLength =0;
		int prevLength=0;
		
		for(int i=0; i<array.length-1;i++){
			if(array[i+1]-array[i]==1){
				currentLength+=1;
			}else{
				if(prevLength<currentLength){
					prevLength=currentLength;
			 }
				currentLength=0;
			}
				
			 if(prevLength<currentLength){
					prevLength=currentLength;
			 }
		
		}
		return prevLength+1;
	}

	public static void main(String[] args) {
		int[] n = {36,41,56,35,44,33,34,92,43,32,42};
		System.out.println(printLongestConsequtiveSequence(n));
	}

}
