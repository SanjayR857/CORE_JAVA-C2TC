package com.predicttheoutput;

import java.util.Scanner;

public class Code13 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int [][] arr=new int[3][3];
	System.out.print("enter the elements");
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			arr[i][j]=scan.nextInt();
		}
	}
	for(int i=2;i>=0;i--) {
		for(int j=0;j<3;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
}
}
/*
output
enter the elements
1 2 3
4 5 6
7 8 9
7 8 9 
4 5 6 
1 2 3 
*/