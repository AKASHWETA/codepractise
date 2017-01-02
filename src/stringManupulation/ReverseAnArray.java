package stringManupulation;



public class ReverseAnArray {
	public String reveArray(String str){
		char[] cl = str.toCharArray();
		char[] c2 = new char[cl.length];
		int count =0;
		char c = '\u0000';
				
		for(int i=0;i <cl.length;i++){
			c = cl[i];
			if(!isAlphabet(c)){
				c2[count++]= c;
			}
		}
		return String.valueOf(c2);
	}
	
	public static boolean isAlphabet(char s){
		if((s >'A' && s<'Z') ||( s>'a' && s<'z')){
		return true;	
		}else{
			return false;
		}
	}
	
	public static String toUpperCase(String str){
		StringBuilder sb = new StringBuilder();
         int len = str.length();
        if(len> 1 &&  len<50){
        for(int i=0; i< str.length();i++){
			  char ch = str.charAt(i);
			  if(ch >= 'a' && ch <= 'z')
		          ch += 'A' - 'a';
		      sb.append(ch);
		}
        }
		return sb.toString();
		
	}
	
	public static int[] mergeSort(int[] list){
		if(list.length<=1){
			return list;
		}
		int[] first  = new int[list.length/2];
		int[] second = new int[list.length-first.length];
		System.arraycopy(list,0,first,0,first.length);
		System.arraycopy(list,first.length,second,0,second.length);
		mergeSort(first);
		mergeSort(second);
		mergeAll(list,first,second);
		return list;
	}
	
	
	public static int[] quickSort(int[] list){
		sort(list,0,list.length-1);
		return list;
	}
	public static void swap(int[] a, int i, int j){
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	
	public static void sort(int[] list, int lowerIndex, int higherIndex){
		int i = lowerIndex;
		int j = higherIndex;
		int pivot = list[lowerIndex +(higherIndex-lowerIndex)/2];
		
		while(i<=j){
			while(list[i]<pivot){
				i++;
			}
			while(list[j]>pivot){
				j--;
			}
			if(i<=j){
				swap(list,i,j);
				i++;
				j--;
			}
		}
		if(lowerIndex< j)
			sort(list,lowerIndex,j);
		if(i<higherIndex)
			sort(list,i,higherIndex);
		
	}
	public static void mergeAll(int[] list, int[] first, int[] second){
		int iFirst = 0;
		int iSecond =0;
		int j =0;
		
		while((iFirst< first.length) && (iSecond < second.length)){
			if(first[iFirst] < second[iSecond]){
				list[j] = first[iFirst];
				iFirst++;
			}else{
				list[j]= second[iSecond];
				iSecond++;
			}
			j++;
		}
		
	System.arraycopy(first,iFirst,list,j, first.length- iFirst);
	System.arraycopy(second,iSecond,list,j,second.length-iSecond);
	}
	
	public static void main (String[] args) {
	  //  Scanner scanner = new Scanner(System.in);
		int[] temp ={22,23,34,5,8,19,56};
		int[] list =quickSort(temp);
		for(int c : list){
			System.out.println(c);
		}
		
	  /*  int testcases = scanner.nextInt();
	    String[] input = new String[testcases];
	    input[0] = scanner.nextLine();
	    input[1] = scanner.nextLine();
	    
	    for(int i =0; i< input.length; i++)
	    	System.out.println(toUpperCase(input[i]));*/
		
	}

}
