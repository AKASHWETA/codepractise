package geekforgeekbasic;

import java.util.Arrays;
import java.util.Scanner;

public class ShortestDistance {

public static char[] shortestDistance(char[] n,int l){
	int Ns=0,Es=0,Ss=0,Ws=0;
	char[] ct = new char[l];
	for(char c : n){
		switch(c){
			case 'N':
				Ns++;
				break;
			case 'E':
				Es++;
				break;
			case 'W':
				Ws++;
				break;
			case 'S':
				Ss++;
				break;
		}
	}
	int s =Math.abs(Es-Ws);
	int m = Math.abs(Ss-Ns);
	     Arrays.fill(ct,0,s,(Es > Ws)?('E'):('W'));
		 Arrays.fill(ct,s,s+m,(Ss > Ns)?('S'):('N'));
	
	return ct;
	
    }
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        String s = in.next();
	        System.out.println(shortestDistance(s.toCharArray(),s.length()));
		 }
	}
