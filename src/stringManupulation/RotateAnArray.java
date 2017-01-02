package stringManupulation;

public class RotateAnArray {
	/**
	 * This is an extension of method 2. Instead of moving one by one, divide the array in different sets
where number of sets is equal to GCD of n and d and move the elements within sets.
If GCD is 1 as is for the above example array (n = 7 and d =2), then elements will be moved within one set only, we just start with temp = arr[0] and keep moving arr[I+d] to arr[I] and finally store temp at the right place.

Here is an example for n =12 and d = 3. GCD is 3 and

Let arr[] be {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}

a)	Elements are first moved in first set – (See below diagram for this movement)

ArrayRotation

          arr[] after this step --> {4 2 3 7 5 6 10 8 9 1 11 12}

b)	Then in second set.
          arr[] after this step --> {4 5 3 7 8 6 10 11 9 1 2 12}

c)	Finally in third set.
          arr[] after this step --> {4 5 6 7 8 9 10 11 12 1 2 3}
	 * @param arr
	 * @param d
	 * @param n
	 */
	public void leftRotate(int arr[], int d, int n){
		int i,j,k,temp;

		for(i=0; i< gcd(d,n); i++){
			temp= arr[i];
			j = i;
			while(true){
				k = j+d;
				if(k >= n)
					k = k-n;
				if(k==i)
					break;
				arr[j] = arr[k];
				j=k;
			}
			arr[j] = temp;
		}
	}

	public int gcd(int d, int n){
		if(n==0){
			return d;
		}else{
			return gcd(n, d% n);
		}
	}
	public static void main(String[] args) {
		  RotateAnArray rotate = new RotateAnArray();
	        int arr[] = {1, 2, 3, 4, 5, 6, 7};
	        rotate.leftRotate(arr, 2, 7);
	        for(int c : arr)
	       System.out.println(c);
	}

	
	public static void rotate(int[] array,int n,int r){
		int k=0;
		for(int i=0; i<=2;i++){
			int j = array[i];
			while(k<array.length){
				array[i]=array[i+1];
				i++;
			}
			
		}
		
	}
}
