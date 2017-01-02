package stringManupulation;

import java.util.HashMap;

public class IsomorphicSring {

	
	public static boolean isIsomorphic(String s1, String s2){
		if(s1==null || s2 == null)
			return false;
		if(s1.length() != s2.length())
			return false;
		HashMap<Character,Character> map = new HashMap<Character,Character>();
		for(int i=0; i< s1.length(); i++){
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);
			if(map.containsKey(c1)){
				if(map.get(c1)!=c2){
					return false;
				}
			} else {
				if(map.containsValue(c2))
					return false;
				map.put(c1, c2);
				
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		String S = "my badluck will change";
		for(int i=0; i < S.length(); i++){
			char j = S.charAt(i);
			System.out.println(j);
		}
	}

}
