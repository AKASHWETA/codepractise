package stringManupulation;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DictionaryMaping {
	
	public static ArrayList matchPattern(String[] dic,String pattern){
		ArrayList<String> list = new ArrayList<String>();
		String codeForPatter = sudoCode(pattern);
		for(int i=0; i< dic.length; i++){
			String patternForItem = sudoCode(dic[i]);
			if(codeForPatter.equals(patternForItem)){
			System.out.println(dic[i]);
			list.add(dic[i]);
			}
		}
		return list;
	}
public static String sudoCode(String item){
	Map<Character,Integer> map = new Hashtable<Character, Integer>();
	int count =0;
	StringBuilder sb = new StringBuilder();
	for(int i=0; i< item.length();i++){
		 if(!map.containsKey(item.charAt(i))){
			map.put(item.charAt(i), count);
			sb.append(count);
			count++;
		 }else{
			 sb.append(map.get(item.charAt(i)));
		 }
		 
	}
	return ""+sb.toString();
}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] dic = null; 
		int i = in.nextInt();
		for(int j=0; j<i; j++){
			int k = in.nextInt();
			dic = new String[k];
			for(int l=0; l<k;l++){
				dic[l]=in.next();
			}
		}
			String s = in.next();
			matchPattern(dic,s);
		}

}
