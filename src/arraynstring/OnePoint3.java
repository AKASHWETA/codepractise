package arraynstring;

public class OnePoint3 {

	
	public static void removeDuplicate(char[] ch ){
		int tail = 1;
		char chi;
		char chj;
		for(int i=0;i<ch.length-1;i++){
			int j =0;
			for(j=0;j<tail;j++){
				chi =ch[i];
				chj =ch[j];
				System.out.println(chi+"== "+chj);
				if(chi==chj)
					break;
			}
			System.out.println(j+"j is and tail is"+tail);
			if(j==tail){
				ch[j]= ch[i];
				++tail;
			}
			
		}
		ch[tail]=0;
	}
	
	public static void  FirstNonRepeatingCharacterInString (){
		String input = "akash";
		int[] count = new int[256];
		
		for(int i=0;i<input.length();i++){
			int val = input.charAt(i);
			if(count[val]==0){
				count[val]=1;
			}else{
				count[val]++;
			}
		}
		
		for(int i=0;i< input.length();i++){
			if(count[input.charAt(i)]==1){
				System.out.print(input.charAt(i));
			}
		}
			
}
	
	public static char[]  removeDupli(String string){
		if(string == null) return null;
		if(string.length() <2) return null;
		int len = string.length();
		char[] str = string.toCharArray();
		boolean[] hit = new boolean[256];
		for(int i=0; i<256; i++){
			hit[i]= false;

		}
		hit[str[0]]= true;
		int tail = 1;
		for(int i=1; i< len; ++i){
		if(!hit[str[i]]){
		str[tail] = str[i];
		++tail;
		hit[str[i]] = true;
		}
		}
		str[tail]=0;
		return str;
		}
	
	public static void removeDuplicatesEff(char[] str) {
		 if (str == null) return;
		 int len = str.length;
		 if (len < 2) return;
		 boolean[] hit = new boolean[256];
		 for (int i = 0; i < 256; ++i) {
			 hit[i] = false;
		 }
		
		 hit[str[0]] = true;
		 int tail = 1;
		 for (int i = 1; i < len; ++i) {
			 if (!hit[str[i]]) {
				 str[tail] = str[i];
				 tail++;
				 hit[str[i]] = true;
			 }
		 }
		 str[tail] = 0;
		 }
	public static boolean allUniqueue(String s){
		boolean[] b = new boolean[256];
		char[] c = new char[s.length()];
		for(int i=0; i<s.length();i++){
			int val = s.charAt(i);
			if(b[val]) return false;
				b[val] = true;
		}
		return true;
	}
	public static void main(String[] args) {
		String str = "aksh";
		char[] ch = str.toCharArray();
		FirstNonRepeatingCharacterInString();
		//removeDuplicate(ch);
		//removeDupli(str);
		/*for(char c : ch)
		System.out.println(c);*/
	}

}


