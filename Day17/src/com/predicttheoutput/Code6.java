package com.predicttheoutput;

import java.util.Scanner;

//Write a Java code to find the number of occurrences of a given number in an array.
public class Code6 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int size=scan.nextInt();
	int arr[]=new int[size];
	int i;
	for(i=0;i<arr.length;i++) {
		arr[i]=scan.nextInt();
	}
 System.out.println("enter the number to find");
 int search_num=scan.nextInt();
 int count=0;
 for(i=0;i<arr.length;i++) {
	 if(arr[i]==search_num) {
		 count++;
	 }
 }
 System.out.println(search_num+" occurred " +count);
}
}
/*
output
5
10
20
10
30
10
enter the number to find
10
10 occured 3
*/