package practice;

public class TransposeMatrix {

	public static void rotate2(int[][] matrix, int n) {
		printMatrix(matrix);
		 for (int layer = 0; layer < n / 2; ++layer) {
		 int first = layer;
		 int last = n - 1 - layer;
		 System.out.println("First>>" + first +" Last >"+ last);
		 for(int i = first; i < last; ++i) {
		 int offset = i - first;
		 System.out.println("offset" + offset);
		 int top = matrix[first][i]; // save top
		 // left -> top
		 matrix[first][i] = matrix[last-offset][first];

		 // bottom -> left
		 matrix[last-offset][first] = matrix[last][last - offset];

		 // right -> bottom
		 matrix[last][last - offset] = matrix[i][last];

		 // top -> right
		 matrix[i][last] = top; // right <- saved top
		 printMatrix(matrix);
		 }
		 } }
	
	public static void rotateMatrix(int mat[][],int n)
	{
		printMatrix(mat);
	    // Consider all squares one by one
	    for (int x = 0; x < n / 2; x++)
	    {
	        // Consider elements in group of 4 in 
	        // current square
	        for (int y = x; y < n-x-1; y++)
	        {
	            // store current cell in temp variable
	            int temp = mat[x][y];
	 
	            // move values from right to top
	            mat[x][y] = mat[y][n-1-x];
	 
	            // move values from bottom to right
	            mat[y][n-1-x] = mat[n-1-x][n-1-y];
	 
	            // move values from left to bottom
	            mat[n-1-x][n-1-y] = mat[n-1-y][x];
	 
	            // assign temp to left
	            mat[n-1-y][x] = temp;
	            printMatrix(mat);
	        }
	    }
	}
	
	public static void rotatPract(int[][] mat, int n){
		printMatrix(mat);
		for(int x =0 ;x<n/2;x++){
			for(int y=x;y<n-x-1;y++){
				int tmp = mat[x][y];
				mat[x][y]=mat[y][n-x-1];
				mat[y][n-x-1] = mat[n-x-1][n-y-1];
				mat[n-1-x][n-y-1]= mat[n-y-1][x];
				mat[n-y-1][x] = tmp;
				printMatrix(mat);
			}
		}
	}
	
	public static void printMatrix(int m[][]){
		for(int i=0;i<m.length;i++){
			for(int j=0;j<m[0].length;j++){
				System.out.print(m[i][j] +"    ");	
			}
			 System.out.print("\n");
		
		}
	}
	
	public static void swapRows(int[][] m) {
	    for (int  i = 0, k = m.length - 1; i < k; ++i, --k) {
	        int[] x = m[i];
	        m[i] = m[k];
	        m[k] = x;
	    }
	}

	private static void transpose(int[][] m) {

        for (int i = 0; i < m.length; i++) {
            for (int j = i; j < m[0].length; j++) {
                int x = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = x;
            }
        }
    }

	public static void rotateByNinetyToLeft(int[][] m) {
	    transpose(m);
	    swapRows(m);
	}

	public static void rotateByNinetyToRight(int[][] m) {
	    swapRows(m);
	    transpose(m);
	}
	
	public static void rotateInplace(int[][] matrix) {
		int n = matrix.length;
		for (int i = 0; i < n / 2; i++) {
			for (int j = 0; j < Math.ceil(((double) n) / 2.); j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[n-1-j][i];
				matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
				matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
				matrix[j][n-1-i] = temp;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		//rotate2(m,m[0].length);
		//rotateInplace(m);
		rotateMatrix(m,m[0].length);
		printMatrix(m);
		
	}
	
	

}
