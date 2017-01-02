package stringManupulation;

public class ReverserAString {

	public static void reverseAWord(char[] s) {
		int i=0;
		for(int j=0; j<s.length; j++){
			if(s[j]== ' '){
				reverse(s,i,j-1);
				i= j+1;
			}
		}
		reverse(s,i,s.length-1);
		//reverse(s,0,s.length-1);
	}
	
	public void reverseWords(char[] s) {
	    int i=0;
	    for(int j=0; j<s.length; j++){
	        if(s[j]==' '){
	            reverse(s, i, j-1);        
	            i=j+1;
	        }
	    }
	 
	   // reverse(s, i, s.length-1);
	 
	    //reverse(s, 0, s.length-1);
	}
	 
	
	public static void reverse(char[] s, int i, int j){
		while(i<j) {
			char tmp = s[i];
			s[i]= s[j];
			s[j]= tmp;
			i++;
			j--;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "he sky is blue";
		char[] c = s.toCharArray();
		reverseAWord(c);
		for(char c1: c)
		System.out.println(c1);
	}

}
