package practice;

public class IntegerToBinary {
	public static void convert(int n) {
        if (n == 0) return;
        convert(n / 2);
        System.out.print(n % 2);
    }
public static void printAllBinary(int n){
	for(int i=0;i<=n;i++){
		System.out.println();
		convert(i);
	}
}
    public static void main(String[] args) {
        int n = 10;
        
        printAllBinary(n);
    }
}
