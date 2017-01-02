package geekforgeekbasic;

public class CountNumber {
	public static boolean checkNumber(int n){
		boolean flag = true;
		int rem;
		while(n!=0){
			rem = n%10;
			if(rem ==0 || rem ==6 || rem == 7 || rem == 8 || rem ==9)
				return false;
				n =n/10;
		}
		return flag;
	}

	public static void main(String[] args) {
		int count =0;
		int n = 100;
		// TODO Auto-generated method stub
		for(int i=1; i<n ; i++){
			if(checkNumber(i))
				count++;
		}
		System.out.println(count);
	}

}
