package com.predicttheoutput;

import java.util.Scanner;

//find the max number in array
public class Code7 {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int size=scan.nextInt();
int arr[]=new int[size];
int i;
for(i=0;i<arr.length;i++) {
	arr[i]=scan.nextInt();
}
int max=0;
for(i=0;i<arr.length;i++) {
	if(arr[i]>max) {
		max=arr[i];
	}
	
}
System.out.println("max: "+max);
}
}
/*
 4
12
32
143
23
max: 143
*/
