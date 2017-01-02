
package arraynstring;


/**
 * Write a method to decide if two strings are anagrams or not
 * @author apalewar
 *
 */
public class FourteenPointTwo {

	public static boolean anagram(String s , String t){
		if(s.length() != t.length())
			return false;
		int letters[] = new int[256];
		int num_unique_char =0;
		int num_completed_t = 0;
		char[] s_array = s.toCharArray();
		for (char c : s_array){
			if(letters[c] ==0)
				++num_unique_char;
			++letters[c];
		}
		
		for(int i = 0; i< t.length(); i++){
			int c = (int) t.charAt(i);
			if(letters[c] ==0){
				return false;
			}
			--letters[c];
			if(letters[c] ==0) {
				++num_completed_t;
				if(num_completed_t == num_unique_char){
					return i== t.length();
				}
			}
		}
		return false;
	}
	
	public static boolean checkAna(String s, String t){
		int[] ch = new int[256];
		int uniqueCharecter =0;
		int numberCompleted=0;
		char[] charArray = s.toCharArray();
		for(char c : charArray){
			if(ch[c]==0){
				++ch[c];
				++uniqueCharecter;
			}
		 }
		for(int i=0;i<t.length();i++){
			int c = (int) t.charAt(i);
			if(ch[c] ==0){ //found more char c in t then s.
				return false;
			}
		--ch[c];
			if(ch[c] ==0){
				++numberCompleted;
				if(numberCompleted ==uniqueCharecter){
					//its match if t has been processed completely
					return i ==t.length()-1;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FourteenPointTwo f = new FourteenPointTwo();
		System.out.println(f.anagram("akash", "hsaka"));
	}

}
