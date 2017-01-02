package practice;

public class MinInsertPalindrom {
	// Recursive function to find minimum number of insersions
	public static int findMinInsertions(char str[], int l, int h)	{
		    // Base Cases
		    if (l > h) return Integer.MAX_VALUE;
		    if (l == h) return 0;
		    if (l == h - 1) return (str[l] == str[h])? 0 : 1;
		 
		    // Check if the first and last characters are same. On the basis of the
		    // comparison result, decide which subrpoblem(s) to call
		    return (str[l] == str[h])? findMinInsertions(str, l + 1, h - 1):
		                               (Math.min(findMinInsertions(str, l, h - 1),
		                                   findMinInsertions(str, l + 1, h)) + 1);
		}

	public static int palProce(String s){
		int i=0; 
		int j=s.length()-1;
		int missmatchCounter = 0;
		while(i<=j){
			if(s.charAt(i)== s.charAt(j)){
				i++;
				j--;
				continue;
			}else{
				i++;
				missmatchCounter++;
			}
		}
		return missmatchCounter;
		}

	public static int palPr(String s){
		int i=0;
		int missMatchCOunter =0;
		int j = s.length()-1;
		while(i<=j){
			if(s.charAt(i)== s.charAt(j)){
				i++;
				j--;
				continue;
			}else{
				i++;
				missMatchCOunter++;
			}
		}
		return missMatchCOunter;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="howr";
		char str[] = s.toCharArray();
		//System.out.println(">>"+ findMinInsertions(str,0,str.length-1));
		System.out.println(">>"+ palPr(s));
	}
}
