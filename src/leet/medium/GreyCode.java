package leet.medium;

import java.util.ArrayList;
import java.util.List;

public class GreyCode {

	public static List<Integer> greyCode(int n){
		List<Integer> result = null;
		if(n==0) {
			result = new ArrayList<Integer>();
			result.add(0);
			return result;
		}
		
		result = greyCode(n-1);
		System.out.println(">>>>>>>>>>>>>>>>"+ n);
		int numAff = 1<< (n-1);
		System.out.println("<<<<<<<<<<<"+ numAff);
		for(int i=result.size()-1;i >=0;i--){
			result.add(numAff + result.get(i));
		}
		return result;
	}
	public static void main(String[] args) {
		List<Integer> c = greyCode(3);
		for(Integer i : c)
		System.out.println(i);
	}

}
