package geekforgeekbasic;


public class HandShake {
	//http://www.geeksforgeeks.org/non-crossing-lines-connect-points-circle/
	

   public static  int catalan(int n) {
        int[] catalan = new int[n+1] ;

        catalan[0] = catalan[1] =1;
        
        for(int i=2; i<=n ; i++){
        	for(int j=0; j<i; j++)
        		catalan[i] += catalan[j] * catalan[i-j-1];
        }
        // Base case
            return catalan[n];
    }
 
   
   
    public static void main(String[] args) {
            System.out.print(catalan(4) + " ");
    }
}