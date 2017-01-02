package codecake;

public class AppleStock {
	    
	    public static int getsellingprice(int[] prices){
	        if(prices.length <2)
	            throw new IllegalArgumentException("Getting a profit requires at least 2 prices");
	        
	        int minPrice = prices[0];
	        int maxProfit = prices[1]- prices[0];
	        
	        for(int i=1;i<prices.length;i++){
	            int currentPrice = prices[i];
	            int potentialProfit=currentPrice - minPrice;
	            maxProfit = Math.max(maxProfit, potentialProfit);
	            minPrice = Math.min(minPrice,currentPrice);
	        }
	        return maxProfit;
	        
	    }
	    public static void main(String[] args) {
	        // run your function through some test cases here
	        // remember: debugging is half the battle!
	        int[] stockPricesYesterday = new int[]{10, 7, 5, 8, 11, 9};
	        System.out.println(getsellingprice(stockPricesYesterday));
	    }
	}
