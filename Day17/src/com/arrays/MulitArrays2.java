package com.arrays;

public class MulitArrays2 {
public static void main(String[] args) {
	int max[][]= {{2,3,4},{1,5,3,2},{1,6}};
	printing_max(max);
}

private static void printing_max(int[][] max) {
	for(int i=0;i<max.length;i++) {
		for(int j=0;j<max[i].length;j++) {
			System.out.print(max[i][j]+" ");
		}
		System.out.println();
	}
	
}
}
/*
output
2 3 4 
1 5 3 2 
1 6 
*/