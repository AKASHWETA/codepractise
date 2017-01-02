package practice;

public class StringTest {

	public static boolean uniqueChar2(String str){
		boolean[] char_set = new boolean[256];
		
		for(int i = 0; i<str.length(); ++i){
			int j = str.charAt(i);
			if(char_set[j])	return false;
			char_set[j] = true;
		}
		return true;
		
	}
	public static void main(String[] args) {
		System.out.println(">>>>>>>>>>>>>>>>>>"+uniqueChar2("TTTTTTTTTTTTTTTTTT"));
	}

}
