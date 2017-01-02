package practice;

import java.util.BitSet;
import java.util.Scanner;

public class GenerateBinaryNumbers {
public	static void printB(int n) {
	for(int i= 0; i<= n; i++){
		System.out.println(fill(i));
	}
    } 
public static String fill(int n){
	if(n==0){
		return "0";
	}
   String binary ="";
   while(n >0){
	   int rem = n% 2;
	   binary = rem + binary;
	   n = n/2;
   }
   return binary;
}

public static void main(String [] args)   {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter n:");
        int n = in.nextInt();
printB(n);
        
        //printBinaryFormat(n);
        
    }
}
