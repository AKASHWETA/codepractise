package practice;

public class BitWiseOperation {

	
	public static int add(int x, int y){
		
		//itrate till thr is no carry
		while(y!=0){
			//carry now contains common set bits of x&y
			int carry = x & y;
			//Sum of bits of x & y where atleast one of the  bit is not set
			x = x^y;
			
			//carry is shifted by one so that adding it to x gives the required sum
			y=carry<<1;
		}
		return x;
	}
	
	public static int recursiveAdd(int x, int y){
		if(y==0){
			return x;
		}else{
			return recursiveAdd(x^y, (x&y)<<1);
		}
	}
	
	public static  int subtract(int x,int y){
		//Itrate till thr is no carry
		while(y!=0){
			//carry now contain common set bit y and unset bit of x
			int borrow =(~x) & y;
			//substraction of bit of x and y where atleast one bits is not set
			x = x^y;
			//borrow is shifted by one so that substratcing it from x gives the required sum
			y = borrow<<1;
		}
		return x;
	}
	public static int reverseAnumber(int n){
		int reverse=0;
		int tmp = 0;
		while (n!=0){
			reverse= reverse*10;
			System.out.println(n+"*10 =" +reverse);
			tmp = n%10;
			System.out.println(n+"%10="+ tmp);
			reverse = reverse+ tmp;
			System.out.println("reverse +tmp="+ reverse);
			n=n/10;
			System.out.println(n+"/10 ="+n);
		}
		return reverse;
		
	}
	
	
	public static void armstrongNumber(int n){
		int tmp = n;
		int remainder,digit=0,sum =0;
	
		while(tmp!=0){
				digit++;
				tmp = tmp/10;
		}
		tmp=n;
		while(tmp!=0){
			remainder = tmp%10;
		    sum = sum+ power(remainder,digit);	
		    tmp = tmp /10;
		}
		
		if(n==sum){
			System.out.println("is an armstrong number"+ n);
		}else{
			System.out.println("is not an armstrong number"+ n);
		}
	}
	
	
	public static int power(int n ,int digit){
		int c, p=1;
		for(c=1;c<=digit;c++){
			p = n*p;
		}
		return p;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println(add(10,113));
		System.out.println(recursiveAdd(10,113));
		System.out.println(subtract(10,4));*/
		
		//System.out.println("reverse a number "+ reverseAnumber(99983));
		armstrongNumber(9926315);
		
		
	}

}
