package geekforgeekbasic;

import java.util.Arrays;

public class MIssingRangeNumbers {
	public static String[] missingRanges(int[] array){
		Arrays.sort(array);
		int pos =0;
		int len = 0;
		String range = null;
		int count=0;
		String[] updated = new String[array.length];
		
		for(int i=0;i<array.length;i++){
			if(array[i]!=len){
				while(array[i]>pos+1){
				 pos++;
				}u
				if(array[i]-len>1){
					range = len+"-"+ pos;
				}else{
					range = len+"";
				}
				pos+=1;
				len=pos+1;
				updated[count++]= range;
				
			}else{
				pos++;
				
			}
		}
		return updated;
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {467,334,500, 169, 724, 478, 358, 962, 464, 705, 145, 281, 827};
		String[] output = missingRanges(test);
		for(String s: output){
		    System.out.println(s);
		}
	}

}
