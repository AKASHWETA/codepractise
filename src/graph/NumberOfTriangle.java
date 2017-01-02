package graph;

public class NumberOfTriangle {

public static void multiply(int A[][], int B[][], int C[][]){
int v= A[0].length;
	for(int i=0; i<v;i++){
		for(int j=0; j<v; j++){
			C[i][j] =0;
			for(int k=0; k<v;k++){
				C[i][j] += A[i][k] * B[k][j];
				}
		}
	}
}

public static int triangleNUmber(int[][] graph){
	int v = graph[0].length;
	int[][] aux2= new int[v][v];
	int[][] aux3 = new int[v][v];
	

	for(int i=0; i< v; ++i)
	for(int j=0; j<v; ++j)
		aux2[i][j] = aux3[i][j]=0;

	multiply(graph,graph,aux2);

	multiply(graph,aux2,aux3);
	
	int trace = trace(aux3);
	return trace /6;
	}

	public static int trace(int[][] graph){
		int v = graph[0].length;
		int trace =0;
		for(int i=0;i<v;i++)
			trace+=graph[i][i];
		return trace;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] graph= {{0, 1, 1, 0},{1, 0, 1, 1},{1, 1, 0, 1}, {0, 1, 1, 0} };
		 System.out.println("tets" +triangleNUmber(graph) );


}
