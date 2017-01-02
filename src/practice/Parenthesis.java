package practice;

import java.util.HashMap;
import java.util.Map;

public class Parenthesis {
public static void printPar(int l,int r,char[] str,int count){
	if(l <0 || r < 1)return; //invalid state
	if(l==0 && r==0){
		System.out.println(str);//found one so print it.
	}
	else{
		if(l>0){ //try left paren, if there  are some available
			str[count] ='(';
			printPar(l-1,r,str,count+1);
		}
		if(r>l){//try right paren. if something is available thr matching left
			str[count] =')';
			printPar(l,r-1,str,count+1);
		}
	}
 }

public static void printPar(int count){
	char[] str = new char[count*2];
	printPar(count, count, str, 0);
}

public static int[] myFunction(int[] arg) {
    int[] update = new int[arg.length];
    Map<Integer,Integer> prod= new HashMap<Integer,Integer>();
    prod.put(0, 1);
    for(int i=0;i<arg.length-1;i++){
      int product = prod.get(i);
        if(product>0){
            int j=i;
            while(j<arg.length){
            	product = product * j+1;
            	j++;
            }
        }else{
            product = product*1;
        }
        prod.put(i,product);
        update[i] =product;
    }
      
    return update;
}
    
public static void main(String[] args) {
    // run your function through some test cases here
    // remember: debugging is half the battle!
  int[] p = {1,7,3,4};
    System.out.println(myFunction(p));
}
}
