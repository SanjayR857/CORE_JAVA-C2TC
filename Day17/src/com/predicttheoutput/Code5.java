package com.predicttheoutput;

import java.util.Scanner;

/*Write a Java code to search a given number in an array. If the element is found then print
 Found, else print Not Found
*/
public class Code5 {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	int size=scan.nextInt();
	int a[]= new int[size];
	int  i;
	for(i=0;i<a.length;i++) {
		a[i]=scan.nextInt();
	}
	//enter the number to find
	System.out.println("enter the number");
	int n=scan.nextInt();
	int count=0;
	for(i=0;i<a.length;i++) {
		if(n==a[i]) {
			count=1;
			break;
		}
	}
	if(count==1) {
		System.out.println(n+" found in array");
	}
	else {
		System.out.println(n+" not found in array");
	}
}
}
/*
output
4
12
20
34
45
enter the number
20
20 found in array
*/