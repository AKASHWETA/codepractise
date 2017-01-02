package arraynstring;

	
import java.util.Arrays;

public class arrangeArray {
	public static void  sortMaxMin(int[] max){
		Arrays.sort(max);
		int k =0;
		int j=max.length;
		for(int i=0;i<j-1;i++){
			max[i]=max[k];
			max[i+1]=max[j];
			k+=2;
			j+=2;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = {4, 5, 1, 2, 3,4};
		sortMaxMin(n);
		for(int i : n)
			System.out.println(i);
	}

}
