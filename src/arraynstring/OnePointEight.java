package arraynstring;

public class OnePointEight {

	public static boolean isRotation(String s1, String s2){
		int len = s1.length();
		//check that s1 and s2 are equal length andnot empty
		if(len == s2.length() && len > 0){
			/*concatenate s1 and s1 within new buffer*/
			String s1s1 = s1 + s1;
			return isSubstring(s1s1, s1);
		}
		return false;
		
	}
	public static boolean isSubstring(String s1s2, String sub) {
	    return s1s2.indexOf(sub) >= 0;
	}

	public static void main(String[] args) {
		int matrix[][]={{50,60,55,67,70},{62,0,70,70,81},{72,66,77,80,69}};
		OnePointSeven.setZero(matrix);
		System.out.println(matrix);
	}

}
