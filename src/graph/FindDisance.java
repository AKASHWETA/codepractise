package graph;

import java.util.LinkedList;
import java.util.Queue;

public class FindDisance {
	
	private static class QueueNode{
		int i,j,distance;
		
		public QueueNode(int i, int j , int d){
			this.i= i;
			this.j = j;
			this.distance =d;
		}
		};

		int row[] = {-1,0,1,0};
		int col[] = {0,1,0,-1};

		public boolean isValid(int i, int j){
			if((i< 0|| i> 4-1) || (j<0 || j> 4-1))
			return false;

		return true;
		}

		public boolean isSafe(int i, int j, char matrix[][], int output[][]){
		  if(matrix[i][j] !='O' || output[i][j] !=-1)
		     return false;
		  else
		   return true;
		}

		void findistance(char matrix[][]){

		int output[][];
		Queue<QueueNode> q = new LinkedList<QueueNode>();

		for(int i=0; i<4; i++){
		 for(int j=0; j< 4; j++){
		 output[i][j] =-1;
		 
		 if(matrix[i][j]=='G'){
			 QueueNode pos = new QueueNode(i,j,0);
		     q.add(pos);
		     output[i][j] =0;
		  }
		}

		while(!q.isEmpty()){
		QueueNode curr = q.peek();
		int x= curr.i, y = curr.j, dist = curr.distance;


		for(int j=0; j<4; j++){
		 if(isSafe(x + row[j], y + col[j],matrix, output) 
		&& isValid(x + row[j], y + col[j])){

		output[x + row[j][y+ col[j]]] = dist +1;
		QueueNode pos = {x + row[i], y + col[i], dist +1};
		q.add(pos);
		}
		}
		q.();
		}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
