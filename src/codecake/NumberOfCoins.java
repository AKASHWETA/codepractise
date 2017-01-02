package codecake;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class NumberOfCoins {
	
	public static void generateChange(int amount,LinkedList<Integer> denominations,
			HashMap<Integer,Integer> usedDenomination){
			if(amount<0)
				return;
				
			if(amount==0){
					 Iterator<Integer> it = usedDenomination.keySet().iterator();
						while(it.hasNext()){
							Integer val = it.next();
							System.out.println(val +"::"+usedDenomination.get(val));
						}
				System.out.println("************************");
				return;
	}

	
		for(Integer denom: denominations){
			if(amount-denom <0)
						continue;
		
					if(usedDenomination.get(denom)==null)
						usedDenomination.put(denom,0);
					
					usedDenomination.put(denom,usedDenomination.get(denom)+1);
					generateChange(amount-denom,denominations,usedDenomination);
					usedDenomination.put(denom,usedDenomination.get(denom)-1);
				}
			}
	
	 public static void main(String[] args) {
		    int amount = 4;
		    int nikle=1;
		    int dollar=2;
		    int ddollar=3;

		    LinkedList<Integer> denominations = new LinkedList<Integer>();

		    denominations.add(ddollar);
		    denominations.add(dollar);
		    denominations.add(nikle);

		    HashMap<Integer,Integer> useddenominations = new HashMap<Integer,Integer>();
		    generateChange(amount, denominations, useddenominations);
		  }
}
