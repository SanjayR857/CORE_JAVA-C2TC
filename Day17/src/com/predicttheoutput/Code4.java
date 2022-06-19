package com.predicttheoutput;

public class Code4 {
public static void main(String[] args) {
	int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[j][i]+" ");
		}
		System.out.println();
	}
}
}
/*
output
1 4 7 
2 5 8 
3 6 9 
*/