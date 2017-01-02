package geekforgeekbasic;

import java.util.Scanner;

public class PalindromingSequence {
	public static void main (String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int flag = 1, i, j, n, t = scanner.nextInt();
	    while(t > 0){
	        n = scanner.nextInt();
	        String str = "";
	        if(scanner.hasNext())
	            str = scanner.next();
	        i = 0; j = n - 1;
	   
	        while(i < (n / 2)){
	            if(str.charAt(i) != str.charAt(j)){
	                flag = 2;
	                break;
	            }
	            i++; j--;
	        }   
	        System.out.print(flag);
	        t--;
	    }
	}
}

