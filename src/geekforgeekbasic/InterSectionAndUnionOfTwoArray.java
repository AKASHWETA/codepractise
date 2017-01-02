package geekforgeekbasic;

import java.util.Arrays;

public class InterSectionAndUnionOfTwoArray {

	public static void intersection(int[] a, int[] b){
		Arrays.sort(a);
		Arrays.sort(b);
		int i=0,j=0;
		while(i< a.length && j < b.length){
			if(a[i] > b[j]){
				//j++;
				System.out.println(b[j++]);
			}else if (a[i]<b[j]){
			//	i++;
				System.out.println(a[i++]);
			}else {
				//System.out.println(b[j++]);
				i++;
				
			}
		}
		
	}
	
	public static void unionOfArray(int[] a, int[] b){
		int i=0,j=0;
		
		while(i< a.length && j < b.length){
			if(a[i] > b[j]){
				System.out.println(b[j++]);
			}else if (a[i]<b[j]){
				System.out.println(" **"+ a[i++]);
			}else {
				System.out.println(" else >> "+b[j++]);
				i++;
			}
		}
		while(i < a.length){
			System.out.println(a[i++]);
		}
		while(j < b.length){
			System.out.println(b[j++]);
		}
	}
	
	public static int getUniqueElement(int[] a, int[] b) {
	    int ret = 0;
	    int i;
	    for (i = 0; i < a.length; i++) {
	        ret ^= a[i] ^ b[i];
	    }
	    return ret ^ b[i];
	}
	public static void getUniqueInTwo(int[] a, int[] b) {
		int m=0; int n=0;
		//for(int i=0;i<a.length ; i++){
			while(m<a.length || n<b.length){
				if(a[m]==b[n]){
					m++;
					n++;
				}else if(a[m]<b[n]){
					while(b[n] >= a[m] && m<=a.length-1){
						if(b[n]==a[m]){
							break;
						}
						System.out.println(a[m]);
						if(m==a.length-1){
							break;
						}
						m++;
					}
					
				}else if(a[m]> b[n]){
					while(a[m]>=b[n] && n <= b.length-1){
						if(b[n]==a[m]){
							break;
						}
							System.out.println(b[n]);
							if(n==b.length-1){
								break;
							}
					n++;
					}
					
				}
					
					
			}
		//}
	}
	
	/** distinct in array**/
	public static void distinct(int[] array){
		Arrays.sort(array);
		for(int i=0;i< array.length;i++){
			while(i<array.length-1 && array[i]== array[i+1]){
				i++;
			}
				System.out.println(array[i]);
			}
		}
	
	public static void main(String[] args) {
		int arr1[] = {1, 2, 4, 5, 6};
		  int arr2[] = {2, 3, 5, 7};
		  int[] arr ={1,1,1,1,1,1,2};
		  intersection(arr1,arr2);
		// distinct(arr);
		// getUniqueInTwo(arr1,arr2);

	}

}
