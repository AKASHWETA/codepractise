package geekforgeekbasic;

public class KeyPadTyping {
	public static final int[] num = {2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9};
	/*public static int getChar(String s){
		s =s.toUpperCase();
		int n =0;
		for(int i=0; i< s.length();i++){
			n *= 10 ;
			n += num[s.charAt(i)-'A'];
		}
		return n;
	}*/ //Wrong
	
	public static String getCharStrig(String s){
		s= s.toUpperCase();
		StringBuffer n = new StringBuffer();
		for(int i=0; i< s.length();i++){
			n = n.append(num[s.charAt(i)-'A']);
			
		}
		return n.toString();
	}
	public static void main(String[] args){
		System.out.println(getCharStrig("geeksforgeeks"));
	//	System.out.println(getChar("geeksforgeeks"));
	}

}
