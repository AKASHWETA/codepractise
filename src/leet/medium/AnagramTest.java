package leet.medium;

public class AnagramTest {

	public static boolean anagramTest(String s1, String s2){
		if(s1.length() == s2.length()){
			char[] s1CharArray = s1.toCharArray();
			for(char c: s1CharArray){
				if(s2.indexOf(c)==-1){
					return false;
				}
			}
			
		}else{
			return false;
		}
		return true;
	}
	
	public static boolean removeDuplicate(String dupcheck){
		char[] charArray = dupcheck.toCharArray();
		boolean flag;
		for(char c: charArray){
			if(dupcheck.lastIndexOf(c) != dupcheck.indexOf(c)){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
	//System.out.println(">>>>>>>>" +removeDuplicate("AKSH") );
	String s = "akash";
	int c = s.charAt(3);
	for(int i=0; i<s.length();i++){
		int o = s.charAt(i);
		System.out.print(Character.toChars(o));
	}
		
	
	}

}
