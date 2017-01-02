package arraynstring;

public class OnePointSeven {

	public static void setZero(int[][] matrix){
		int[] row = new int[matrix.length];
		int[] column = new int[matrix[0].length];
		//Store the row and clumn index wwith value 0;
		for(int i =0; i< matrix.length; i++){
			for(int j=0 ;j<matrix[0].length; j++){
				if(matrix[i][j] == 0){
					row[i]= 0;
					column[j]= 0;
				}
			}
		}
		
		//set arr[i][j] to 0 if either row i or column j has a 0
		for(int i =0; i< matrix.length; i++){
			for(int j =0; j < matrix[0].length; j++){
				if((row[i] ==1 ||column[j] ==1)){
					matrix[i][j] =0;
				}
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		int matrix[][]={{50,60,55,67,70},{62,0,70,70,81},{72,66,77,80,69}};
		OnePointSeven.setZero(matrix);
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				System.out.print(" " + matrix[i][j]);
			}
			System.out.println("");
		}
		System.out.println(matrix);
	}

}
