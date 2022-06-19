package com;

import java.util.Scanner;

//write program to check whether the number is prime or not
public class ToCheckPrime {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	//input to number of loop
	int i=scan.nextInt();
	
	ToCheckPrime t=new ToCheckPrime();
	for(int j=0;j<i;j++) {
	t.display(scan.nextInt());
}
}
 void display(int a) {
	 int count=0;
	 for(int i=2;i<=a;i++) {
		 if(a%i==0) {
			 count++;
		 }
	 }
	 if(count==1) {
		 System.out.println(a+" prime number");
	 }
	 else {
		 System.out.println(a+" not prime number");
	 }
 }
 
}
/*
output
4
5
5 prime number
3
3 prime number
7
7 prime number
8
8 not prime number
*/