package stringManupulation;

public class AllPalindrom {
	static int count;
	public static void  getallPalindrome(String s){
		for(int i=0;i<s.length();i++){
			isPalindrom(s,i,i);
			isPalindrom(s,i,i+1);
		}
	}
	public static String isPalindrom(String s, int begin,int end){
		while(end>=0 && begin>=0 && end<=s.length()-1 && s.charAt(begin)== s.charAt(end)){
			if(begin!=end){
				System.out.println(s.substring(begin,end+1));
				count++;
			}
			begin--;
			end++;
		}
		return s.substring(begin+1,end);
	}
	
	
	public static void main(String[] args) {
		getallPalindrome("abaab");
	}

}
