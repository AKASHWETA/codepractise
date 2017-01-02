

class GFG {
    public static void isSorted(int[] a) 
{
    	int[] array[];
    int i;
    for(i = 0; i <a.length-2; i ++){
        if (a[i] < a[i+1]) {
            System.out.println("1");
        } else {
        System.out.println("0");
        break;
        }
    }
}
	public static void main (String[] args) {
	int ar[] = {90,100,200,400,500,400,700,900 };
	
	isSorted(ar);
	}
}