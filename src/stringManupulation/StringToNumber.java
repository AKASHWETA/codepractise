package stringManupulation;

import java.util.Scanner;

public class StringToNumber {

	public static String converToNum(String s){
		if(!s.matches("[0-9]+") || !s.matches("[0-9]+")){
		       return null;
		   }
		   return (Integer.parseInt(s) * Integer.parseInt(s))+"";
		}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		for(int j=0; j<i;j++){
			String s = in.next();
			String s1 = in .next();
			converToNum(s);
		}
	}

}
