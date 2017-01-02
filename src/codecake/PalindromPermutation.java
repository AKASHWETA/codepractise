package codecake;

import java.util.HashSet;
import java.util.Set;

public class PalindromPermutation {
	public static boolean hasPalindromePermutation(String theString){

		Set<Character> unpairedCharacter = new HashSet<Character>();
		for(char c: theString.toCharArray()){
		
			if(unpairedCharacter.contains(c)){
				unpairedCharacter.remove(c);
			}else{
				unpairedCharacter.add(c);
			}
		}
		return unpairedCharacter.size()<=1;
	}
	public static void main(String[] args) {
		String check ="teest";
		System.out.println(">>>."+hasPalindromePermutation(check));

	}

}
