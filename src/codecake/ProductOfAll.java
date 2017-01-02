package codecake;

import java.util.Arrays;

public class ProductOfAll {
	public static int[] myFunction(int[] arg) {
        int product =1;
        int[] productSoFar = new int[arg.length];
        for(int i=0;i<arg.length;i++){
            productSoFar[i] = product;
		    product *= arg[i];
        }
        
        product = 1;
            
        for(int i=arg.length-1;i>=0;i--){
    	  productSoFar[i]*=product;
          product *= arg[i];
        }
        return productSoFar;
     }
       
	
	public static int[] myFunct(int[] arg){
		int product =1;
		int[] productSoFar = new int[arg.length];
		for(int i=0; i< arg.length;i++){
			productSoFar[i] = product;
			product = product * arg[i];
		}
			product=1;
		for(int i = arg.length-1;i>=0;i--){
			productSoFar[i] *= product;
			product *=arg[i];
		}
			return productSoFar;
		
	}
    public static void main(String[] args) {
        // run your function through some test cases here
        // remember: debugging is half the battle!
      int[] p = {1,7,3,4};
        System.out.println(Arrays.toString(myFunction(p)));
    }
}
