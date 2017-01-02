package codecake;

public class HighestProductOs {
	public int highestProductOf3(int[] arrayOfInt){

		if(arrayOfInt.length < 3)
		 throw new IllegalArgumentException("Need three");

		int highest = Math.max(arrayOfInt[0],arrayOfInt[1]);
		int lowest = Math.min(arrayOfInt[0],arrayOfInt[1]);

		int highestProductOf2 = arrayOfInt[0] * arrayOfInt[1];
		int lowestProductOf2 = arrayOfInt[0] * arrayOfInt[1];

		int highestProductOf3 = arrayOfInt[0] * arrayOfInt[1] * arrayOfInt[2];


		for(int i=2;i<arrayOfInt.length;i++){
		int current = arrayOfInt[i];

		highestProductOf3 = Math.max(Math.max(highestProductOf3, current*highestProductOf2),current*lowestProductOf2);

		highestProductOf2 =Math.max(Math.max(highestProductOf2,current *highest),current*lowest);

		highest = Math.max(current,highest);
		lowest = Math.min(current,lowest);
		}
		return highestProductOf3;


		}

}
