package graph;

public class SegmentTreeRMQ {

	int st[];
	int minVal(int x, int y){
		return (x<y)?x:y;
	}
	
	int getMid(int s, int e){
		return s + (e-s)/2;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
