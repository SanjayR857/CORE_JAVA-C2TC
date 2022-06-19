package com;

import java.util.Scanner;

//write program to add number from to 1 to n
public class Sum {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	//enter the number
	int n=scan.nextInt();
	int sum=0;
	for(int i=1;i<=n;i++) {
		sum=sum+i;
		
	}
	System.out.println("sum:"+sum);
}
}
//output 
//n=10
//sum: 55