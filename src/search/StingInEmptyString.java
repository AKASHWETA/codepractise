package search;

public class StingInEmptyString {
public static  int search(String str[] , String s){
	if(s == null) return -1;
	if(s==""){
		for(int i=0;i<=str.length;i++){
			if(str[i] =="") return i;
			
		}
		
		return -1;
	}
	return search(str,0, str.length-1,s);
}


public static int seracho(String[] string, String s){
	if(s==null){
		return -1;
	}
	if(s==""){
		for(int i=0;i<string.length; i++){
			if(string[i]=="") return i;	
		}
	}
	return seracho(string, s,0, string.length-1);
}
public static int seracho(String[] str, String s, int first, int last){
	while(first < last){
		while(first < last && str[last] ==""){
			--last;
		}
		
		if(first> last) return -1;
		int mid = first + last >>1;
	while(str[mid]==""){
		mid++;
	}
	int r = str[mid].compareTo(s);
	if(r==0) return mid;
	if(r< mid){
		first = mid+1;
	}else if(r > mid){
		last = mid-1;
	}
	}
	return -1;
}
public static int search(String[] str, int first, int last, String s){
	
	while(first<=last){
		while(first<=last && str[last] ==""){
			--last;
		}
		
		if(last < first){
			return -1;
		}
		
		int mid= (first+last) >>1;
		while(str[mid]==""){
			++mid;
		}
		int r = str[mid].compareTo(s);
		if(r==0)return mid;
		
		if(r < mid){
			first =mid+1;
		}if(r>mid){
			last = mid-1;
		}
}
	return -1;
}

public static void main(String[] args){
      String[] words = {"at", "", "", "", "ball", "","", "car", "", "", "dad", "", "","ball"};
     System.out.println("Key ballfound at index: "+seracho(words,"ball"));

}
}

