package leet.medium;

public class BarChart {

 private int findBiggestRectangle(int[] bars){
	 int maxArea= Integer.MIN_VALUE;;
 
    int dim1 = bars.length;
    int[][] dim = new int[dim1][dim1];
    
    if(dim1==0){
        return 0;
    }else{    
    for(int i=1; i < dim1; i++){// width will alaways be one an dkeep adding
     for(int j=0;j+i-1<dim1; j++ ){//itrate through each element
         int addWidth = j + i -1; //add width
          if(i==1){
            dim[j][j] = bars[j];
            maxArea = Math.max(maxArea,dim[j][j]); // first check the area with with 1
           }else{//itrate and check if the area of the sum of the next bar is more then the existing  sum of the existing barc and it
        	   dim[j][addWidth] = Math.min(dim[j][addWidth-1], bars[addWidth]);
           maxArea = Math.max(maxArea,dim[j][addWidth]*i);
           }
     	}
    
    }
   
    }
    return maxArea;
 }
    
    public static void main(String[] args){
    	BarChart barChart = new BarChart();
    int[] dimesions = {19,11,13,29,7,45,57,65,25};
    System.out.println(barChart.findBiggestRectangle(dimesions));
}
}	