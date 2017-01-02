package practice;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class MaxAmount {
	int max(int a, int b)  {    return a > b ? a : b;  }
	int min(int a, int b)  {    return a < b ? a : b;  }
    // Returns optimal value possible that a player can collect from
	// an array of coins of size n. Note than n must be even
    public static int maxAmount(int[] array, int n){
    	// Create a table to store solutions of subproblems
    	int table[][]= new int[n][n], gap, i, j, x, y, z;
    	// Fill table using above recursive formula. Note that the table
	    // is filled in diagonal fashion (similar to http://goo.gl/PQqoS),
	    // from diagonal elements to table[0][n-1] which is the result.
    	for(gap=0;gap<n; gap++){
    		for (i = 0, j = gap; j < n; ++i, ++j){
    			// Here x is value of F(i+2, j), y is F(i+1, j-1) and
	            // z is F(i, j-2) in above recursive formula
    			 // Here x is value of F(i+2, j), y is F(i+1, j-1) and
	            // z is F(i, j-2) in above recursive formula
	            x = ((i+2) <= j) ? table[i+2][j] : 0;
	           
	            y = ((i+1) <= (j-1)) ? table[i+1][j-1] : 0;
	            z = (i <= (j-2))? table[i][j-2]: 0;
	 
	            table[i][j] = Math.max(array[i] + Math.min(x, y), array[j] + Math.min(y, z));
	            
	        }
	    }
	 
	    return table[0][n-1];
    }
	public static void main (String[] args) {
	  int[] coinRow = {468,335,1,170,225,479,359,463,465,206,146,282,328,462,492,496,443,328,437,392,105,403,154,293,383,422,217,219,396,448,227,272,39,370,413,168,300,36,395,204,312,323};
	System.out.println(maxAmount(coinRow,coinRow.length));
	}
}