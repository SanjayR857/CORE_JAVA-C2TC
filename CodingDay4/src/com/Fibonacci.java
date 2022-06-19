package com;

import java.util.Scanner;

//write a program to print fibonacci series

public class Fibonacci {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	//input 
	int n=scan.nextInt();
	int n1=0;
	int n2=1;
	int sum=0;
	for(int i=0;i<n;i++) {
		sum=n1+n2;
		n1=n2;
		n2=sum;
		System.out.print(sum+" ");
	}
}
}
/*
output
8
1 2 3 5 8 13 21 34 
*/