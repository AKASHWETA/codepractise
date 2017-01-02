package practice;

import java.util.ArrayList;
import java.util.List;

public class RandomLogic {

	public static ArrayList<String> getPerm(String s){
		ArrayList<String> permutation = new ArrayList<String>();
		if(s ==null){
			return null;
		}else if(s.length()==0){
			permutation.add("");
			return permutation;
		}
		char first = s.charAt(0);//get first charecter
		String remainder = s.substring(1);
		ArrayList<String> words = getPerm(remainder);
		for(String word : words){
			for(int j=0;j<=word.length();j++){
				permutation.add(insetrCharAt(word,first,j));
			}
		}
		return permutation;
	}
	
	public static String insetrCharAt(String word,char c,int i)	{
		String start =word.substring(0,i);
		String end = word.substring(i);
		System.out.println("FINAL word is>>." + start + c+ end);
		return start + c+ end;
	}
	public static void main(String[] args) {
		String s = "Abc";
		List<String> t =(ArrayList<String>) getPerm(s);
		for(String y: t)
		System.out.println(":::::::::::::"+ y);
	}

}
