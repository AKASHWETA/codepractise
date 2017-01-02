package stringManupulation;

import java.util.Scanner;

public class LengthEncoding {
	public static String encode(String s){
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<s.length();i++){
			sb.append(s.charAt(i));
			int j =i+1;
			int counter =1;
			while(i<s.length()-1 && s.charAt(i)== s.charAt(j)){
				counter++;
				i++;
				if(j<s.length()){
					j++;
				}
			}
			sb.append(counter);
			System.out.println(sb);
		}
		return ""+sb;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCount = in.nextInt();
		for(int i=0; i<testCount;i++){
			String s = in.next();
			encode(s);
		}
	}

}
