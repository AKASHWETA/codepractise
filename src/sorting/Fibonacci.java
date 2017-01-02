package sorting;

public class Fibonacci {
static long[] fibArray = new long[26];

public static long fib(int n){ 
	long fibValue=0;
	if(n==0){
		return 0;
}else if(n==1){
		return 1;
}else if(fibArray[(int)n]!=0){
	return fibArray[(int)n];
}else{
	fibValue= fib(n-1)+ fib(n-2);
	fibArray[(int)n] =fibValue;
	return 	fibValue;
	}
}

static long[] fabArray = new long[26];


public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(8));
	}

}
