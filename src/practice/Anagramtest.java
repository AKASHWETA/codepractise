package practice;

public class Anagramtest {

	public static boolean anagaramTest(String s1, String s2){
		if(s1.length() != s2.length()) return false;
		int[] letters = new int[256];
		int num_unique_char=0;
		int num_completed =0;
		char[] s1Array = s1.toCharArray();
		
		for(char c : s1Array){
			if(letters[c]==0) ++num_unique_char;
			++letters[c];
		}
		
		for(int i=0;i<s2.length();++i){
			char c = s2.charAt(i);
			if(letters[c]==0){
				return false;
			}
			--letters[c];
			
			if(letters[c]==0){
				++num_completed;
				if(num_completed== num_unique_char){
					return i ==s2.length()-1;
				}
			}
		}
		return false;
	}
	
	
	public static boolean anagramAnother(String s1, String s2){
		if(s1.length() != s2.length())
			return false;
		
		if(s1 == null || s2 == null)
			return false;
		
		int[] count = new int[26];
		char[] aArray = s1.toLowerCase().toCharArray();
		char[] bArray = s2.toLowerCase().toCharArray();
		
		for(int i=0; i< aArray.length; i++){
			count[aArray[i]-97]++;
			count[bArray[i]-97]--;
		}
		
		for(int j=0; j<count.length;j++){
			if(count[j]!=0){
				return false;
			}
		}
		return true;
		
	}
	
	public static boolean anagramTest(String s1, String s2){
		if(s1.length()!=s2.length())
		return false;

		if(s1==null || s2==null)
		return false;

		int[] count = new int[26];

		char[] a1 = s1.toLowerCase().toCharArray();
		char[] a2 = s2.toLowerCase().toCharArray();

		for(int i=0; i<a1.length;i++){
		   count[a1[i]-97]++;
		   count[a2[i]-97]--;
		}
		for(int j=0; j< count.length;j++){
		if(count[j]!=0){
		return false;
		}
		return true;
		}
		return true;
		}
	public static boolean isROtation(String s1, String s2){

		int len = s1.length();
		if(len==s2.length() && len >0){
		String s1s2= s1+s2;

		//return isSubstring(s1s2,s2);
		
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(">."+ anagramTest("Akahs","kasha"));
	}

}
