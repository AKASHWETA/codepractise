package stringManupulation;

import java.util.ArrayList;
import java.util.List;

public class StringPermutation {
	
	public static ArrayList<String> getAllPermutation(String s){
			ArrayList<String> permutation = new ArrayList<String>();
	
			if(s==null)
			  return null;
	
			if(s.length()==0){
			  permutation.add("");
			  return permutation;
			}
	
	
			char first = s.charAt(0);
			String remainder = s.substring(1);
			ArrayList<String> words = getAllPermutation(remainder);
	
			for(String word : words){
			  for(int i=0; i<= word.length();i++){
			    permutation.add(insertChar(word,first,i));
			  }
			}
		return permutation;
		}

		public static String insertChar(String word, char c, int i){
			String first = word.substring(0,i);
			String last= word.substring(i);
			return first+c+ last;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  List<String> a=getAllPermutation("12345");
	  for(String d : a)
	  System.out.println(d);
	}

}
