package practice;

import java.util.Scanner;

public class LongestPalindrome {

	public static String isPalindrome(String s,int begin, int end){
		while(end >=0 && begin>=0 && end <=s.length()-1 && s.charAt(begin) == s.charAt(end) ){
			begin--;
			end++;
	 }
		return s.substring(begin+1,end);
}
	
	public static String longestPalindrom(String s){
		String maxPalindrom ="";
		String currentPalindrom = "";
		for(int i=0; i<s.length();i++) {
			currentPalindrom = isPalindrome(s,i,i);
			if(currentPalindrom.length() > maxPalindrom.length()){
				maxPalindrom = currentPalindrom;
			}
			currentPalindrom=isPalindrome(s, i, i+1);
			if(currentPalindrom.length() > maxPalindrom.length()){
				maxPalindrom = currentPalindrom;
			}
		}
		return maxPalindrom;
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		 int loop = scanner.nextInt();
		 for(int i=0; i< loop; i++){
			 String num = scanner.next();
			 System.out.println(longestPalindrom(num));
		 }
	}

}
