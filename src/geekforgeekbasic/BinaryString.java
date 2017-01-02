package geekforgeekbasic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class BinaryString {

	public static Set<String> printAllCombination(StringBuilder s,int index,Set<String> set){
		if(index==s.length()){
			return null;
		}
		StringBuffer b = new StringBuffer();
	if(s.charAt(index)=='?'){
		 String p = null;
		s.setCharAt(index, '0');
		p = s.toString().replaceAll("\\?", "1");
		set.add(p);
		printAllCombination(s,index+1,set);
		s.setCharAt(index, '1');
		p = s.toString().replaceAll("\\?", "0");
		set.add(p);
		printAllCombination(s,index+1,set);
			
			
	}else{
		printAllCombination(s,index+1,set);
	}
	return set;
	}
	
	public static String rep(StringBuilder s, char c){
		String s1 = s.toString();
		s1.replaceAll(String.valueOf("?"), String.valueOf(c));
		return s1;
	}
	
	
	public static void main(String[] args) {
		System.out.println(args[0]+"" + args.length);
		
	}

}
