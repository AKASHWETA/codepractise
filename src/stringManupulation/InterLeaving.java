package stringManupulation;

import java.util.Scanner;

public class InterLeaving {
	public static int isInterLeaving(String s){
		if(s==null || s.length()==0) return -1;
		String[] arrayOfChar = s.split(" ");
			if(arrayOfChar[2].contains(arrayOfChar[0]) && arrayOfChar[2].contains(arrayOfChar[1])){
				return 1;
		}else{
			return 0;
		}
	}
	
	public static int isValidIpAddress(String ipAddress){
		if(ipAddress==null || ipAddress.length()==0) return -1;
		String[] address = ipAddress.split(".");
		if(){
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		for(int j=0; j<i;j++){
			String p = s.next();
			System.out.println(p);
		}

	}

}
