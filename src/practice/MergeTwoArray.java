package practice;

public class MergeTwoArray {
	
public static void mergeBoth(int[] a,int[] b, int n, int m){
	int k= m+n-1;
	int i= m-1;
	int j = n-1;
	 while(i>=0 && j>=0){
		 if(a[i] > b[j]){
			 a[k--] =a[i--];
		 }else{
			 a[k--] = b[j--];
		 }
	 }
	 while(j>=0){
		 a[k--] =b[j--];
	 }
 }



public static void mergeTwo(int ar1[], int ar2[], int m, int n){

	// Iterate through all elements of ar2[] starting from
    // the last element
    for (int i=n-1; i>=0; i--)  {
        /* Find the smallest element greater than ar2[i]. Move all
           elements one position ahead till the smallest greater
           element is not found */
        int j, last = ar1[m-1];
     //   for (j=m-1; j >= 0 && ar1[j] > ar2[i]; j--){
        for (j=m-1; j >= 0; j--){
        	if(ar1[j] > ar2[i]){
        		ar1[j+1] = ar1[j];
        	}else{
        		ar2[i+1] = ar1[j];
        	}
        }

        // If there was a greater element
        if (j != m-1)
        {
            ar1[j+1] = ar2[i];
            ar2[i] = last;
        }
    }
}


/**Iterate through every element of ar2[] starting from last 
element. Do following for every element ar2[i]
 a) Store last element of ar1[i]: last = ar1[i]
 b) Loop from last element of ar1[] while element ar1[j] is 
    smaller than ar2[i].
       ar1[j+1] = ar1[j] // Move element one position ahead
       j--
 c) If any element of ar1[] was moved or (j != m-1)
       ar1[j+1] = ar2[i] 
       ar2[i] = last  **/
	
	public static void main(String[] args) {
		 int a[] = {1, 5, 9, 10, 15, 20};
		    int b[] = {2, 3, 8, 13};
		    mergeTwo(a,b,a.length-1,b.length-1);
		
		for(int c: a)
			System.out.println(c);
		
		for(int c: b)
			System.out.println(c);
	}

}
